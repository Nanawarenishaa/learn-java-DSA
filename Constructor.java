class A{
    A(){
        System.out.println("A constructor called..");
    }
}

class B extends A {
    B(){
        System.out.println("B constructor called...");
    }
}
class Constructor {
    public static void main(String[] args) {
        B b = new B();
    
    }
}