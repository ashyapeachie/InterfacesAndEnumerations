/*
 * Filename: Truck.java
 * Author: Ashya
 * Description: defines a Truck class that also extends Vehicle and implements Insurable
 */

/* derived truck class */
public class Truck extends Vehicle implements Insurable {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payLoadCapacity) {
        super(make, model, year, VehicleType.TRUCK);
        this.payloadCapacity = payLoadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload capacity: " + payloadCapacity + "tons");
        System.out.println("Insurance cost: $" + getInsuranceCost());
    }
    // info is printed for the user to see

    @Override
    public double getInsuranceCost() {
        return 1000 + (payloadCapacity * 200);
    }
    // math is done and printed for the user
}