
package employeepayrollsystem;

public class FullTimeEmployee extends Employee{
    private double montlySalary;

    public FullTimeEmployee(String name, int id, double montlySalary){
        super(id, name);
        this.montlySalary = montlySalary;
    }

    @Override
    public double calculateSalary(){
        return montlySalary;
    }

}
