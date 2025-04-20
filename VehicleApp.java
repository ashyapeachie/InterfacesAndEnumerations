/*
 * Filename: VehicleApp.java
 * Author: Ashya
 * Description: the main application file that runs the program
 */

 import java.util.Scanner;

/* main class */
public class VehicleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nEnter vehicle " + (i + 1) + " details:");
        }
    }
}