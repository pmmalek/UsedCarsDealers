package pl.apache.maven;

import java.math.BigDecimal;

public class Samochód {

 private String brand;

 private String color;

 private int  doors;

 private BigDecimal price;

 private int mileage;

 private int date;

 private int maxSpeed;

 public Samochód(String brand, String color, int doors, BigDecimal price, int mileage, int date, int maxSpeed) {
  this.brand = brand;
  this.color = color;
  this.doors = doors;
  this.price = price;
  this.mileage = mileage;
  this.date = date;
  this.maxSpeed = maxSpeed;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getDoors() {
  return doors;
 }

 public void setDoors(int doors) {
  this.doors = doors;
 }

 public BigDecimal getPrice() {
  return price;
 }

 public void setPrice(BigDecimal price) {
  this.price = price;
 }

 public int getMileage() {
  return mileage;
 }

 public void setMileage(int mileage) {
  this.mileage = mileage;
 }

 public int getDate() {
  return date;
 }

 public void setDate(int date) {
  this.date = date;
 }

 public int getMaxSpeed() {
  return maxSpeed;
 }

 public void setMaxSpeed(int maxSpeed) {
  this.maxSpeed = maxSpeed;
 }

 @Override
 public String toString() {
  return super.toString();
 }
}