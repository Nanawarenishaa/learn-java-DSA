class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void show() {
        System.out.println("Child1 class");
    }
}

class Child2 extends Parent {
    void show() {
        System.out.println("Child2 class");
    }
}

public class HierarchicalInhertance {
    public static void main(String[] args) {
      Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        child1.display(); 
        child1.show();    
        child2.display(); 
        child2.show();    
    }
}
