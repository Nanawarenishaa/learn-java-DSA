package QuesPaper;

public class question1 {

	
	int add(int a, int b) {
		return a+b;
	}
	
	
	double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		question1 Q1= new question1();
		
		int sum1 = Q1.add(10, 20);
		double sum2 = Q1.add(30.5, 69.5);
		
		System.out.println("sum of two integer number:"+sum1);
		System.out.print("sum of two double number:"+sum2);
	}
	
}

