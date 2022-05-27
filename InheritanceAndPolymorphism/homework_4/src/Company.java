import java.util.*;

public class Company {

    private List<Employee> employees = new ArrayList<>();


    public void hire(Employee employee) {
        employees.add(employee);

    }

    public void hireAll(List<Employee> employees) {
        this.employees.addAll(employees);

    }

    public void fire(Employee employee) {
        employees.remove(employee);

    }

    public int companyIncome() {
        int income = 0;
        for (Employee i : employees) {
            if (i instanceof Manager) {
                income += ((Manager) i).getBonus();
            }
        }
        return income;
    }

    public int getIncome() {
        return companyIncome();
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