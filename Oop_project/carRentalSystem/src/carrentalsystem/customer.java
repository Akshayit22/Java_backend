/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author Presidio
 */
public class customer {
    private String customerId;
    private String name;

    public customer(String customerId,String name){
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }

}
