/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author Presidio
 */
public class car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;
    
    
    public car(String carId, String brand, String model,double rate){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = rate;
        this.isAvailable = true;
    }
    
    public String getCarId(){
        return carId;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public double calculatePrice(int rentalDays){
        return basePricePerDay * rentalDays;
    }
    
    public void rent(){
        this.isAvailable = false;
    }
    
    public void returnCar(){
        this.isAvailable = true;
    }
    
}
