import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private ArrayList<Double> grades;

    public Student(String name, int age, String studentId, ArrayList<Double> grades) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grades = grades;
    }

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.age = 0;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println(toString());
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void updateGrade(double grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nAge: " + age +
               "\nID: " + studentId +
               "\nGrades: " + grades;
    }
}
