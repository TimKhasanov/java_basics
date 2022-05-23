import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company staff = new Company();
        newEmployees(staff);
        listOfTheHighestSalaries(staff);
        listOfTheLowestSalaries(staff);
        layoffsOfEmployees(staff);
        listOfTheHighestSalaries(staff);
        listOfTheLowestSalaries(staff);

    }

    private static void newEmployees(Company staff) {
        for (int i = 0; i < 180; i++) {
            Operator operator = new Operator();
            staff.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager();
            staff.hire(manager);
        }

        for (int i = 0; i < 10; i++) {
            TopManager topManager = new TopManager();
            staff.hire(topManager);
        }


    }

    private static void listOfTheHighestSalaries(Company staff) {
        System.out.println("Самые высокие зарплаты: ");
        List<Employee> topSalary = staff.getTopSalaryStaff(15);
        for (Employee employee : topSalary) {
            System.out.println(employee.getMonthSalary() + " руб.");
        }
    }

    private static void listOfTheLowestSalaries(Company staff) {
        System.out.println("Самые низкие зарплаты: ");
        List<Employee> theLowestSalary = staff.getLowestSalaryStaff(30);
        for (Employee employee : theLowestSalary) {
            System.out.println(employee.getMonthSalary() + " руб.");
        }
    }

    private static void layoffsOfEmployees(Company staff) {
        List<Employee> employees = staff.getEmployees();
        for (int i = 0; i < 136; i++) {
            staff.fire(employees.get(i));
        }
        System.out.println("Уволено 50% сотрудников, осталось " + staff.getEmployees().size());

    }
}
