import java.util.ArrayList;

public class StudentTester {

    public static void main(String[] args) {

        ArrayList<Double> grades = new ArrayList<>();
        grades.add(90.0);
        grades.add(85.5);

        Student s1 = new Student("Suraj", 19, "S101", grades);
        s1.displayInfo();
        System.out.println("Adult: " + s1.isAdult());

        System.out.println();

        Student s2 = new Student("Nischal", 18, "S102");
        s2.updateGrade(86.0);
        s2.updateGrade(93.0);
        s2.displayInfo();
        System.out.println("Adult: " + s2.isAdult());

        System.out.println();

        Student s3 = new Student("Nelson", "S103");
        s3.displayInfo();
    }
}

