/*
 * Filename: VehicleApp.java
 * Author: Ashya
 * Description: the main application file that runs the program
 */

//import java.util.Scanner;

/* main class */
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", "Camry", 2021, 4);
        vehicles[1] = new Car("Mitsubishi", "Mirage ES", 2021, 4);
        // may still add the ability for user input

        for (Vehicle v : vehicles) {
            System.out.println("*Vehicle Info*");
            v.displayInfo();
            System.out.println();
        }
    }
}