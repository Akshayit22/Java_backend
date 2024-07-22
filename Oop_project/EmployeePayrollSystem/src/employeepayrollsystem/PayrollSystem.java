
package employeepayrollsystem;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

    private List<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee e :employeeList){
            if(e.getId() == id){
                employeeToRemove = e;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for(Employee e :employeeList){
            System.out.println(e);
        }
    }


}
