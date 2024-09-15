abstract class Animal {
    abstract void Sound();
    void Sleep(String name) {
        System.out.println(name + " is sleeping.");
    }
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

public class abstractEx2 {
    public static void main(String args[]) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.Sleep("dog");  
        dog.Sound();       

        cat.Sleep("cat");  
        cat.Sound();       
    }
}
