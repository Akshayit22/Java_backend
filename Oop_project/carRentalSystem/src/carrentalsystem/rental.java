/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author Presidio
 */
public class rental {
    private car carObj;
    private customer customerObj;
    private int days;

    public rental(car carObj,customer customerObj,int days){
        this.carObj = carObj;
        this.customerObj = customerObj;
        this.days = days;
    }

    public car getCar(){
        return carObj;
    }

    public customer getCustomer(){
        return customerObj;
    }

    public int getDays(){
        return days;
    }

}
