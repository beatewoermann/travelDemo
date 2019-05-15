package com.example.travel.travelDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * @author JavaSolutionsGuide
 *
 */
@Entity
@Table(name="TRAVELDISTANCE")
public class TravelDistance {
  
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
  
 @Column(name="CITY_FROM_NAME")
  String cityFrom;
  
 @Column(name="CITY_TO_NAME")
  String cityTo;
  
 @Column(name="DISTANCE")
 private Integer distance;
 
 public Long getId() {
  return id;
 }
 
 public void setId(Long id) {
  this.id = id;
 }
 
 public String getCityFrom() {
  return cityFrom;
 }
 
 public void setCityFrom(String cityFrom) {
  this.cityFrom = cityFrom;
 }
 
public String getCityTo() {
    return cityTo;
 }
   
public void setCityTo(String cityTo) {
 this.cityTo = cityTo;
 }
 

 public Integer getDistance() {
  return distance;
 }
 
 public void setDistance(Integer distance) {
  this.distance = distance;
 }
 
 public int getDistance(String cityFrom, String cityTo) {

    return distance;
 }


 
}