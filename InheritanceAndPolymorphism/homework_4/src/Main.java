public class Main {
    public static void main(String[] args) {
        Company staff = new Company();
        newEmployees(staff);
        layoffsOfEmployees(staff);
    }


    private static void newEmployees(Company staff) {
        for (int i = 0; i <= 180; i++) {
            Employee operator = new Operator();
            staff.hire(operator);
        }
        for (int i = 0; i <= 80; i++) {
            Employee manager = new Manager();
            staff.hire(manager);
        }
        for (int i = 0; i <= 10; i++) {
            Employee topManager = new TopManager();
            staff.hire(topManager);
        }

    }

    private static void layoffsOfEmployees(Company staff) {
        int listOfEmployees = staff.listOfEmployees();
        for (int i = 0; i < listOfEmployees / 2; i++) {
            int index = (int) (Math.random() * staff.listOfEmployees());
            Employee list = staff.getEmployees().get(index);
            staff.fire(list);
            System.out.println("Уволено " + listOfEmployees / 2 + "Человек");
        }

    }


}
