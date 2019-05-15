package com.example.travel.travelDemo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.travel.travelDemo.entity.TravelDistance;
 
@Repository
public interface TravelDistanceRepository extends JpaRepository<TravelDistance,Long>{
 
}