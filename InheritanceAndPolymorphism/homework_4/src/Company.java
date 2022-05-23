import java.util.*;

public class Company implements Employee {
    private final  List<Employee> employees= new ArrayList<Employee>();

     public void hire(Employee employee){
         this.employees.add(employee);

     }
     public void hireAll(Collection<Employee> employees){
         this.employees.addAll(employees);

    }
    public void fire(Employee employee){
         employees.remove(employee);

    }
    public static int getIncome(){
         return 14000000;
    }
    public  int listOfEmployees(){
         return employees.size();
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return employees;
    }
    public List<Employee> getEmployees(){
         return employees;
    }


    @Override
    public int getMonthSalary() {
        return Company.getIncome();
    }
}