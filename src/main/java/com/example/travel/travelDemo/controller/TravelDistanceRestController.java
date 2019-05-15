package com.example.travel.travelDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.travel.travelDemo.entity.TravelDistance;
import com.example.travel.travelDemo.service.TravelDistanceService; 
 
/**
 * @author Beate Woermann
 *
 */
@RestController
public class TravelDistanceRestController {
  
 @Autowired
 private TravelDistanceService travelDistanceService;
  
 public void setTravelDistanceService(TravelDistanceService travelDistanceService) {
  this.travelDistanceService = travelDistanceService;
 }
 
 @GetMapping("/api/travelDistances")
 public List<TravelDistance> getTravelDistances() {
  List<TravelDistance> travelDistances = travelDistanceService.retrieveTravelDistances();
  return travelDistances;
 }
  
 @GetMapping("/api/travelDistances/{travelDistanceId}")
 public TravelDistance getTravelDistance(@PathVariable(name="travelDistanceId")Long travelDistanceId) {
  return travelDistanceService.getTravelDistance(travelDistanceId);
 }
  
 @PostMapping("/api/travelDistances")
 public void saveTravelDistance(TravelDistance travelDistance){
  travelDistanceService.saveTravelDistance(travelDistance);
  System.out.println("TravelDistance Saved Successfully");
 }
  
 @DeleteMapping("/api/travelDistances/{travelDistanceId}")
 public void deleteTravelDistance(@PathVariable(name="travelDistanceId")Long travelDistanceId){
  travelDistanceService.deleteTravelDistance(travelDistanceId);
  System.out.println("TravelDistance Deleted Successfully");
 }
  
 @PutMapping("/api/travelDistances/{travelDistanceId}")
 public void updateTravelDistance(@RequestBody TravelDistance travelDistance,
   @PathVariable(name="travelDistanceId")Long travelDistanceId){
  TravelDistance travD = travelDistanceService.getTravelDistance(travelDistanceId);
  if(travD != null){
    travelDistanceService.updateTravelDistance(travelDistance);
  }
   
 }

 @GetMapping("/api/travelDistances/{Origin}/{Destination}")
 public int getDistanceToDrive(@PathVariable(name="Origin")String origin, @PathVariable(name="Destination")String destination){
  return travelDistanceService.getDistance(origin, destination);
 }
 
}