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
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println();
        System.out.println();
    }

    @Override 
    public double getInsuranceCost() {
        return 500 + (numberOfDoors * 100);
    }
}
