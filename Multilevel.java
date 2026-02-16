class Animal {
    String name;
    void eat(){
        System.out.println("This animal eat food.");

    }
}

class Dog extends Animal {
    void bark(){
        System.out.println(name+" is barking");
    }
}

class Puppy extends Dog {
    void weep(){
        System.err.println(name+" weeping..");
    }
}

public class Multilevel{
    public static void main(String[] args) {
        Puppy mul=new Puppy();
        mul.name="Tommy";
        mul.eat();
        mul.bark();
        mul.weep();

    }
}

 
