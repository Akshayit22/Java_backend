
package carshowroommanagementsystem;

import java.util.Scanner;


public class Car extends Showroom implements Utility {
    
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_type;
    String car_mode;
    int car_price;
    
    @Override
    public void get_details() {
        System.out.println("================= CAR DETAILS ============================");
        System.out.println("Name : " + car_name);
        System.out.println("Color: " + car_color);
        System.out.println("Fuel Type : "+car_fuel_type);
        System.out.println("Type : " + car_type);
        System.out.println("Model : " + car_mode);
        System.out.println("Price : " + car_price);
        System.out.println("=============================================");
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================== ENTER CAR DETAILS ========================\n");
        
        System.out.println("Enter Car Name : ");
        this.car_name = sc.nextLine();
        
        System.out.println("Enter Car Color : ");
        this.car_color = sc.nextLine();
        
        System.out.println("Enter Car Type (SVU/Thar/TATA): ");
        this.car_type = sc.nextLine();
        
        System.out.println("Enter Car Fuel Type (petrol/CNG/Hybrid) : ");
        this.car_fuel_type = sc.nextLine();
        
        
        System.out.println("Enter Car Mode (Automatic / Manual) : ");
        this.car_mode = sc.nextLine();
        
        System.out.println("Enter Car Price : ");
        this.car_price = sc.nextInt();
        
        total_cars_in_stock++;
    }
}
