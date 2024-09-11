class parent {
	
	int data;
	parent(){
	System.out.println("default constructor is called");
	}

	parent( int data){
		this.data=data;
	System.out.println("Parameterized constructor is called");
	}

} 

public class child extends parent{
	 child(int data) {
        super(data); 
        System.out.println("Parameterized constructor of Child is called");
    }
	public static void main(String args[]){
	    child ch =new child(150);

	}
}