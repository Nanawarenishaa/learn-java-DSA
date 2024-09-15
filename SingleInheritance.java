class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); 
        child.show();    
    }
}
