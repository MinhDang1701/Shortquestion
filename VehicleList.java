package xe;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleList {
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        return null;
    }

    public void updateVehicleById(String id) {
        Vehicle vehicle = findVehicleById(id);
        if (vehicle != null) {
            System.out.println("Updating vehicle with ID: " + id);
           
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    public void deleteVehicleById(String id) {
        Vehicle vehicle = findVehicleById(id);
        if (vehicle != null) {
            vehicleList.remove(vehicle);
            System.out.println("Vehicle deleted successfully!");
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    public void displayAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicle vehicle : vehicleList) {
                vehicle.displayDetails();
            }
        }
    }

   

    public Truck findTruckWithLongestDistance() {
        Truck longestTruck = null;
        double longestDistance = 0;
        for (Vehicle v : vehicleList) {
            if (v instanceof Truck truck) {
                if (truck.getDistance() > longestDistance) {
                    longestDistance = truck.getDistance();
                    longestTruck = truck;
                }
            }
        }
        return longestTruck;
    }
}
