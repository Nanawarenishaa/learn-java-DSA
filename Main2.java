class MyClass {
    static int staticVar = 10;  
    int instanceVar = 20;       

   
    static void staticMethod() {
        System.out.println("Static variable: " + staticVar); 
         //System.out.println("Instance variable: " + instanceVar); 
    }

   
    void instanceMethod() {
        System.out.println("Static variable: " + staticVar);   
        System.out.println("Instance variable: " + instanceVar); 
    }
}

public class Main2 {
    public static void main(String[] args) {
        
        MyClass.staticMethod();

        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}
