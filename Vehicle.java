/*
 * Filename: Vehicle.java
 * Author: Ashya
 * Description: defines a base class for all vehicle types
 */

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // reinstating 
    public void displayInfo() {
        System.out.println("Vehicle Info: ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
