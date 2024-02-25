public class Rector extends AdministrativeStaff{

    @Override
    public void workStyle() {
        System.out.println("Rector is the highest member in a university");
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary() + super.calculateSalary();
        return salary;
    }

    public void runTheSchool(){
        System.out.println("Rector runs the school.");
    }

}
