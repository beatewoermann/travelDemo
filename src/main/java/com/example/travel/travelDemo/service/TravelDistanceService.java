package com.example.travel.travelDemo.service;
 
import java.util.List;
 
import com.example.travel.travelDemo.entity.TravelDistance;
 
/**
 * @author Beate Woermann
 *
 */
public interface TravelDistanceService {
 public List<TravelDistance> retrieveTravelDistances();
  
 public TravelDistance getTravelDistance(Long travelDistanceId);
  
 public void saveTravelDistance(TravelDistance travelDistance);
  
 public void deleteTravelDistance(Long travelDistanceId);
  
 public void updateTravelDistance(TravelDistance travelDistance);

 public int getDistance(String origin, String destination);

 //public String[] getFromCities();

 //public String[] getToCities();
}