/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeepayrollsystem;


abstract class Employee {

    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();
    
    @Override
    public String toString(){
        return "Employee [name = "+name + " , id = "+id+" , salary = " + calculateSalary() + "]";
    }

}
