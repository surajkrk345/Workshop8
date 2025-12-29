public class StudentTester {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Suraj", 19, 85.5);
        
        Student s2 = new Student(102, "Aman", 17);

        s1.displayInfo();
        System.out.println("Is Adult: " + s1.isAdult());
        System.out.println(s1.toString());

        System.out.println();

        s2.displayInfo();
        System.out.println("Is Adult: " + s2.isAdult());
        
        s2.updateGrade(88.0);
        System.out.println("After updating grade:");
        System.out.println(s2.toString());
    }
}
