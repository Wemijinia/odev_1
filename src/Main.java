public class Main {

    public static void main(String[] args) {

        Faculty faculty = new Faculty();
        AdministrativeStaff administrativeStaff = new AdministrativeStaff();
        Professor professor = new Professor();
        Rector rector = new Rector();

        faculty.setEmployeeId(1);
        administrativeStaff.setEmployeeId(2);
        professor.setEmployeeId(3);
        rector.setEmployeeId(4);

        faculty.setTotalWorkingYears(2);
        administrativeStaff.setTotalWorkingYears(2);
        professor.setTotalWorkingYears(2);
        rector.setTotalWorkingYears(2);

        System.out.println("Staff id " + faculty.getEmployeeId() + " earns " + faculty.calculateSalary());
        System.out.println("Staff id " + administrativeStaff.getEmployeeId() + " earns " + administrativeStaff.calculateSalary());
        System.out.println("Staff id " + professor.getEmployeeId() + " earns " + professor.calculateSalary());
        System.out.println("Staff id " + rector.getEmployeeId() + " earns " + rector.calculateSalary());

        System.out.println("\n");

        faculty.workStyle();
        administrativeStaff.workStyle();
        professor.workStyle();
        rector.workStyle();



    }


}
