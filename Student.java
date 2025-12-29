public class Student {

    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void updateGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name +
               ", Age=" + age + ", Grade=" + grade + "]";
    }
}
