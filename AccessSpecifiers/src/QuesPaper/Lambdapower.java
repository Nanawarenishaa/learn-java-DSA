package QuesPaper;


interface Power{
	
	int calculate(int x, int y);
}

public class Lambdapower {
    public static void main(String args[]) {
    	
    	Power p= (x , y)-> (int) Math.pow(x,y);
    	
    	int result= p.calculate(4,2);
    	
    	System.out.println("power: "+result);
    }
}
