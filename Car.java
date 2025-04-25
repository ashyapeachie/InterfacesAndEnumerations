/*
* Filename: Car.java
* Author: Ashya
* Description: defines a Car class that inherits from Vehicle and implements Insurable
*/ 

/* derived car class */
public class Car extends Vehicle implements Insurable {
    private int numberOfDoors;
    // detaik specific to cars
    
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year, VehicleType.CAR);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Insurance cost: $" + getInsuranceCost());
    }

    @Override 
    public double getInsuranceCost() {
        return 500 + (numberOfDoors * 100);
    }
}
