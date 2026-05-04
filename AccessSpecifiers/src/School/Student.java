package School;

public class Student {
	public String name="Nisha";
	private int marks=80;
	
	protected int rollNo=60;
	public int getMarks() {
		return marks;
	}
	
	
	private void display() {
		System.out.println("This is a private method."+marks);
	}
	
	public void callDisplay() {
		display();
	}
	
	public void Show() {
		System.out.println("I am public classs.");
	}
	
	  public int add(int a, int b) {
	        return a + b;
	    }
	  
	  public static void main(String[] args) {
		  Student s =new Student();
		  s.marks=90;
		  System.out.println(s.marks);
		  
		  System.out.println(s.getMarks());
		  s.display();
		  
		  
	  }
}


