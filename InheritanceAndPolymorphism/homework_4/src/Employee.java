
public interface Employee extends Comparable<Employee> {
    default void setCompany(Company company){}
    final int FIXED_PART_OF_SALARY = 45000;

    int getMonthSalary();

    @Override
    default int compareTo(Employee o) {
        return Integer.compare(getMonthSalary(),o.getMonthSalary());
    }
}
