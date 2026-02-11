abstract class Animal {

    
    abstract void eat();

    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {

    void eat() {
        System.out.println("Dog eats bones");
    }
}
public class Main {
    public static void main(String[] args) {

        Animal a = new Dog(); 
        a.eat();
        a.sleep();
    }
}
