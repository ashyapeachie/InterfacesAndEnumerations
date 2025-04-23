/*
 * Filename: VehicleApp.java
 * Author: Ashya
 * Description: the main application file that runs the program
 */

//import java.util.Scanner;

/* main class */
public class VehicleApp {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);- may exclude the ability for user input
        Vehicle[] vehicles = new Vehicle[3];

        for (Vehicle v : vehicles) {
            System.out.println();
            v.displayInfo();
            System.out.println();
        }
    }
}