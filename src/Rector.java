public class Rector extends AdministrativeStaff{

    @Override
    public void workStyle() {
        System.out.println("Rector runs the school!");
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary() + super.calculateSalary();
        return salary;
    }



}
