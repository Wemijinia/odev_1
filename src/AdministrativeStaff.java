public class AdministrativeStaff extends Staff{

    @Override
    public void workStyle() {
        System.out.println("Administrative Staff do administrative things... ");
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
