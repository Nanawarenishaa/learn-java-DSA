abstract class Animal{
	abstract void Sound();
	void Sleep( String name ){
	System.out.println(name + " is sleeping.");
	}
}
 class Dog extends Animal{
    void Sound(){
     System.out.println("Dog barks");

 }
 }

 public class abstractEx{
   public static void main(String args[]){
       Dog dog=new Dog();
       dog.Sleep("dog");
       dog.Sound();
      
   }
 }