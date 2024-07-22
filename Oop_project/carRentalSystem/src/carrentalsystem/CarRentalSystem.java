/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsystem;



/**
 *
 * @author Presidio
 */

public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarRentalSysOperation rentalSystem = new CarRentalSysOperation();

        car car1 = new car("C0001", "Toyata", "Camry", 60.0);
        car car2 = new car("C0002", "Honda", "Accord", 100.0);
        car car3 = new car("C0003", "Mahindra", "Thar", 150.0);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();

    }
    
}
