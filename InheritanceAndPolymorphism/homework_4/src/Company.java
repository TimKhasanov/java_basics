import java.util.*;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        this.employees.add(employee);

    }

    public void hireAll(List<Employee> employees) {
        this.employees.addAll(employees);

    }

    public void fire(Employee employee) {
        employees.remove(employee);

    }

    public static int getIncome() {
        return 14000000;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees);
        Collections.reverse(employees);
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        return employees.subList(0, count);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);

    }
}