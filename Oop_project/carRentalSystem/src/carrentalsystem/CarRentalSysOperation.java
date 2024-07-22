/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Presidio
 */

public class CarRentalSysOperation {
    private List<car> cars;
    private List<customer> customers;
    private List<rental> rentals;

    public CarRentalSysOperation(){
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(car carObj){
        cars.add(carObj);
    }

    public void addCustomer(customer customerObj){
        customers.add(customerObj);
    }

    public void rentCar(car carObj, customer customerObj, int days){
        if(carObj.isAvailable()){
            carObj.rent();
            rentals.add(new rental(carObj, customerObj, days));
        }
        else{
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(car carObj){
        carObj.returnCar();
        rental rentalCarToRemove = null;

        for(rental rentalObj: rentals){
            if(rentalObj.getCar() == carObj){
                rentalCarToRemove = rentalObj;
                break;
            }
            if(rentalCarToRemove != null){
                rentals.remove(rentalCarToRemove);
            }
            else{
                System.out.println("Car was not renteds");
            }
        }

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Car Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("\n== Rent a Car ==\n");
                System.out.print("Enter your name: ");
                String customerName = scanner.nextLine();

                System.out.println("\nAvailable Cars:");
                for (car carObj : cars) {
                    if (carObj.isAvailable()) {
                        System.out.println(carObj.getCarId() + " - " + carObj.getBrand() + " " + carObj.getModel());
                    }
                }

                System.out.print("\nEnter the car ID you want to rent: ");
                String carId = scanner.nextLine().toString();

                System.out.print("Enter the number of days for rental: ");
                int rentalDays = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                customer newCustomer = new customer("CUS" + (customers.size() + 1), customerName);
                addCustomer(newCustomer);

                car selectedCar = null;
                for (car carObj : cars) {
                    if (carObj.getCarId().equals(carId) && carObj.isAvailable()) {
                        selectedCar = carObj;
                        break;
                    }else{
                        System.out.println("Car with given carId Not exist or it is not available for rent now.");
                    }
                }

                if (selectedCar != null) {
                    double totalPrice = selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n== Rental Information ==\n");
                    System.out.println("Customer ID: " + newCustomer.getCustomerId());
                    System.out.println("Customer Name: " + newCustomer.getName());
                    System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = scanner.nextLine().toString();

                    if (confirm.equalsIgnoreCase("Y")) {
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("\nCar rented successfully.");
                    } else {
                        System.out.println("\nRental canceled.");
                    }
                } else {
                    System.out.println("\nInvalid car selection or car not available for rent.");
                }
            } else if (choice == 2) {
                System.out.println("\n== Return a Car ==\n");
                System.out.print("Enter the car ID you want to return: ");
                String carId = scanner.nextLine().toString();

                car carToReturn = null;
                for (car carObj : cars) {
                    if (carObj.getCarId().equals(carId) && !carObj.isAvailable()) {
                        carToReturn = carObj;
                        break;
                    }else{
                        System.out.println("Car with given carId Not exist or it is not rented.");
                    }
                }

                if (carToReturn != null) {
                    customer customerObj = null;
                    for (rental rentalObj : rentals) {
                        if (rentalObj.getCar() == carToReturn) {
                            customerObj = rentalObj.getCustomer();
                            break;
                        }
                    }

                    if (customerObj != null) {
                        returnCar(carToReturn);
                        System.out.println("Car returned successfully by " + customerObj.getName());
                    } else {
                        System.out.println("Car was not rented or rental information is missing.");
                    }
                } else {
                    System.out.println("Invalid car ID or car is not rented.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        
        scanner.close();
        System.out.println("\nThank you for using the Car Rental System!");
    }

}
