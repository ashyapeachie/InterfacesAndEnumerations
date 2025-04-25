/*
 * Filename: Vehicle.java
 * Author: Ashya
 * Description: defines a base class for all vehicle types
 */

abstract public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected VehicleType vehicleType;
    //

    public Vehicle (String make, String model, int year, VehicleType vehicleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleType = vehicleType;
    }
    // reinstating 
    
    public void displayInfo() {
        System.out.println("Vehicle Info: ");
        System.out.println("Make: " + make);
        System.out.println("Modle: " + model);
        System.out.println("Year: " + year);
        System.out.println("Vehivle type: " + vehicleType);
    }
}
