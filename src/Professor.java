public class Professor extends Faculty{

    @Override
    public void workStyle() {
        System.out.println("Professors teach like a pro!");
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();
        salary += (salary * 50) / 100;
        return salary;
    }
}
