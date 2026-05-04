package Collage;
import School.Student;

public class Test {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Show();
        System.out.println(S1.name);
        System.out.println(S1.getMarks());
        S1.callDisplay();
        System.out.println(S1.add(10, 5)); 
        
    }
}

