package QuesPaper;

class Person {

	String name;
	int age;
	
	void acceptDetails(String n, int a) {
		name=n;
		age=a;
		
	}
	
	void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
	
}

class question2 extends Person{
	double salary;
	
	void acceptManager(String n, int a, double s) {
		acceptDetails(n, a);
		salary=s;
	}
	void displayManager() {
		displayDetails();
		System.out.println("Salary:"+salary);
	}
	public static void main(String args[]) {
		question2 p1=new question2();
		
		p1.acceptManager("Nisha",22,30000.00);
		p1.displayManager();
		
		
	}
}
