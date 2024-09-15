abstract class Animal {
    abstract void Sound();
}

class Dog extends Animal {
    void Sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void Sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphismExWithAbstractClass {
    public static void main(String[] args) {
        Animal animal1 = new Dog();  
        Animal animal2 = new Cat();  

        animal1.Sound();  
        animal2.Sound();  
    }
}
