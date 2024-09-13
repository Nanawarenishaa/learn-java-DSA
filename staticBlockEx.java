class Example {
	static int value;
	static{
	 value=10;
	 System.out.println("Static Block executed");
	}
}
 public class staticBlockEx{
   public static void main(String args[]){
    System.out.println(Example.value);
   }
 }