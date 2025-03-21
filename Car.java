/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xe;

/**
 *
 * @author ThinkPad
 */
public class Car extends Vehicle{
    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }


    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public double calculateRentealCost(){
        double cost=rentalPricePerDay*1;
        if(fuelType.equalsIgnoreCase("electric")){
            cost*=0.9;
        }
        return cost;
    }
  @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats + ", Fuel Type: " + fuelType);
    }
}
