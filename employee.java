import java.util.*;
class Employee{
int eno;
String ename;
String addr;
double salary;

Scanner sc = new Scanner(System.in);

void getdata(){
System.out.println("Enter Eno:");
eno=sc.nextInt();
sc.nextLine(); 

System.out.println("Enter Ename:");
ename=sc.next();

System.out.println("Enter Address:");
addr=sc.next();

}

void Salary(int HRA, int B_salary )
{
  salary= HRA+B_salary*0.1;
}

void display(){
System.out.println("Employee No:"+eno);
System.out.println("Employee Name:"+ename);
System.out.println("Employee Address:"+addr);
System.out.println("Employee Salary:"+salary);


}
}

class Main {
public static void main(String args[]){
 Employee emp1= new Employee();
Employee emp2= new Employee();
emp1.getdata();
emp2.getdata();

emp1.Salary(2500,40000);
emp2.Salary(3500,45000);

emp1.display();
emp2.display();
}


}
