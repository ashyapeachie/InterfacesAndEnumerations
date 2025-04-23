/*
 * Filename: Truck.java
 * Author: Ashya
 * Description: defines a Truck class that also extends Vehicle and implements Insurable
 */

/* derived truck class */
public class Truck extends Vehicle implements Insurable {
    private double payLoadCapacity;

    public Truck(String make, String model, int year, double payLoadCapacity) {
        super(make, model, year);
        this.payLoadCapacity = payLoadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println();
        System.out.println();
    }
    // info is printed for the user to see

    @Override
    public double getInsuranceCost() {
        return 1000 + (payLoadCapacity * 200);
    }
    // math is done and printed for the user
}