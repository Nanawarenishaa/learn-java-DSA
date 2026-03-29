
import java.util.Scanner;



class classMain{
    public static void main(String[] args){
        System.out.println("hello!!");
        int n=2;
        Student[] students=new Student[n];
        Scanner sc =new Scanner(System.in);
        for(int i=0; i<n;i++){
            students[i]=new Student();
            System.out.println("Enter details for student "+(n));

            System.out.println("Enter student roll no.:");
            students[i].rollNo=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student Name:");
            students[i].name=sc.nextLine();

            System.out.println("Enter student Marks:");
            students[i].marks=sc.nextFloat();


        }
            for (int i = 0; i < n; i++) {
                System.out.println("/nstudent details:");
                System.out.println("student Roll No:"+ students[i].rollNo);
                System.out.println("student Name"+ students[i].name);
                System.out.println("student marks:"+ students[i].marks);
            }

        // student1.rollNo=21;
        // student1.name="nisha";
        // student1.marks=88.6f;
        // System.out.println(student1.name);
        // System.out.println(student1.rollNo);
        // System.out.println(student1.marks);
    }
}

class Student{
    int rollNo;
    String name;
    float marks;
}