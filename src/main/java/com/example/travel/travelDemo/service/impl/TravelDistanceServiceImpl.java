package com.example.travel.travelDemo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.travel.travelDemo.entity.TravelDistance;
import com.example.travel.travelDemo.repository.TravelDistanceRepository;
import com.example.travel.travelDemo.service.TravelDistanceService; 
/**
 * @author Beate Woermann
 *
 */
@Service
public class TravelDistanceServiceImpl implements TravelDistanceService{

   @PersistenceContext
   private EntityManager em;

 @Autowired
 private TravelDistanceRepository travelDistanceRepository;
 
 public void setTravelDistanceRepository(TravelDistanceRepository travelDistanceRepository) {
  this.travelDistanceRepository = travelDistanceRepository;
 }



 public List<TravelDistance> retrieveTravelDistances() {
  List<TravelDistance> travelDistances = travelDistanceRepository.findAll();
  return travelDistances;
 }
  
 public TravelDistance getTravelDistance(Long travelDistanceId) {
  Optional<TravelDistance> optTravD= travelDistanceRepository.findById(travelDistanceId);
  return optTravD.get();
 }
  
 public void saveTravelDistance(TravelDistance travelDistance){
    travelDistanceRepository.save(travelDistance);
 }
  
 public void deleteTravelDistance(Long travelDistanceId){
    travelDistanceRepository.deleteById(travelDistanceId);
 }
  
 public void updateTravelDistance(TravelDistance travelDistance) {
    travelDistanceRepository.save(travelDistance);
 }

 public int getDistance(String origin, String destination) {
 
  
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<TravelDistance> criteria = cb.createQuery(TravelDistance.class);

      Root<TravelDistance> root = criteria.from(TravelDistance.class);
    //  Predicate fromCityPredicate = cb.equal(TravelDistance.class.getField("cityFrom"), origin);
    //  Predicate toCityPredicate = cb.equal(TravelDistance.class.getField("cityTo"), destination);
//cq.where(fromCityPredicate, toCityPredicate);

   //   TypedQuery<TravelDistance> query = em.createQuery(cq);
    //  return query.getResultList().get;
    criteria.where(cb.and(cb.equal(root.get("cityFrom"),origin),cb.equal(root.get("cityTo"),destination)));
    List<TravelDistance> distances = em.createQuery(criteria).getResultList();
    return distances.get(0).getDistance();
  }

    
 
 
}