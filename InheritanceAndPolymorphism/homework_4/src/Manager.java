public class Manager implements Employee{


   private final int bonus = (int)(Math.random()*(140000 + 1 - 115000) + 115000);
   private final int salaryBonus = bonus /100 * 5;



    @Override
    public int getMonthSalary() {
        return FIXED_PART_OF_SALARY + salaryBonus;
    }
}
