/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeepayrollsystem;

public class EmployeePayrollSystem {

    
    public static void main(String[] args) {
        // System.out.println("Employee Payroll System.");
        PayrollSystem payrollSystem = new PayrollSystem();
        
        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 201, 30 , 15.0);

        System.out.println("Adding Employee to EmployeePayrollSystem.");
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        
        
        System.out.println("Employee List : ");
        payrollSystem.displayEmployees();
        
        System.out.println("\nRemoving Employee..");
        payrollSystem.removeEmployee(201);
        
        System.out.println("\nNew Employee List : ");
        payrollSystem.displayEmployees();

       
    }
    
}
