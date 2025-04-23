/*
 * Filename: Vehicle.java
 * Author: Ashya
 * Description: defines a base class for all vehicle types
 */

abstract public class Vehicle {
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
        System.out.println("Make: " + make);
        System.out.println("Modle: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
