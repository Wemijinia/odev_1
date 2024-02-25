public abstract class Staff implements GeneralInformation {

    private int employeeId;
    private int totalWorkingYears;

    @Override
    public void workStyle() {
        System.out.println("All employees must work!");
    }
    @Override
    public int calculateSalary() {
        int salary = CONSTANT * totalWorkingYears;
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTotalWorkingYears() {
        return totalWorkingYears;
    }

    public void setTotalWorkingYears(int totalWorkingYears) {
        this.totalWorkingYears = totalWorkingYears;
    }
}

