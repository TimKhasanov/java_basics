public class TopManager implements Employee {
    private int salaryBonus = FIXED_PART_OF_SALARY / 100 * 150;
    private Company company;

    public TopManager(Company company) {
        setCompany(company);
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {

        return FIXED_PART_OF_SALARY + company.getIncome() > 10000000 ?
                (FIXED_PART_OF_SALARY + salaryBonus) : FIXED_PART_OF_SALARY;
    }


}
