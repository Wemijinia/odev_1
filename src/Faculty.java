public class Faculty extends Staff {

    private int whichLesson;

    @Override
    public void workStyle() {
        System.out.println("Faculty member teaches.");
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }

    public int getWhichLesson() {
        return whichLesson;
    }

    public void setWhichLesson(int whichLesson) {
        this.whichLesson = whichLesson;
    }

}
