/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xe;

/**
 *
 * @author ThinkPad
 */
public class Truck extends Vehicle {
    private double loadCapacity;
    private double distance;

    public Truck() {
    }

    public Truck(double loadCapacity, double distance, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double calculateRentalCost() {
        return rentalPricePerDay + (distance * 5); 
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons, Distance: " + distance + " km");
    }

    @Override
    public double calculateRentealCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
   
}
