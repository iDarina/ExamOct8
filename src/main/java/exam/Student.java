package exam;

public class Student extends Customer{
    private long studentID;
    private static long studentsCounter;
    protected final double DISCOUNT = 0.5;


    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.studentID = studentsCounter;
        studentsCounter++;
    }

    public long getStudentID() {
        return studentID;
    }

    public static long getStudentsCounter() {
        return studentsCounter;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public void printStudentsCounter(){
        System.out.println("We have created " +  studentsCounter);
    }



    @Override
    public void printInfo() {
        System.out.println("Student ID " + this.studentsCounter + ": " + "Student name: " + getName());
    }
}
