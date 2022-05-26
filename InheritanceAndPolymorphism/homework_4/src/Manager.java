public class Manager implements Employee {

    private int bonus;
    private int salaryBonus;

    public Manager() {
        bonus = (int) (Math.random() * (140000 + 1 - 115000) + 115000);
        salaryBonus = bonus / 100 * 5;
    }

    @Override
    public int getMonthSalary() {
        return FIXED_PART_OF_SALARY + salaryBonus;
    }

    public int getBonus() {
        return bonus;
    }
}
