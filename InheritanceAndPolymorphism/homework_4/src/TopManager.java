public class TopManager implements Employee {
    private int bonus;
    private int salaryBonus;

    public TopManager() {
        bonus = (int) (Math.random() * (140000 + 1 - 115000) + 115000);
        salaryBonus = bonus / 100 * 150;
    }

    @Override
    public int getMonthSalary() {
        return FIXED_PART_OF_SALARY + Company.getIncome() > 10000000 ? (FIXED_PART_OF_SALARY + salaryBonus) : 0;
    }
}
