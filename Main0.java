class Animal{
	void MakeSound(){
	System.out.println("Animal makes a sound");
	}
}
 class Dog extends Animal {
  void Bark(){
  System.out.println("Dog barks");
  }
 }
  public class Main0{
  public static void main(String args[]){
     Dog dog= new Dog();
     dog.MakeSound();
     dog.Bark();
     }
  }
 