class Animal{
    String name;
    void eat(){
        System.err.println("this animal eats food.");
        
    }
}

class Dog extends Animal{
    void Sound(){
        System.err.println(name+" barks!!");

    }
}

class singleInherit {
    public static void main(String[] args) {
        
    Dog d = new Dog();
    d.name="Dog";
    d.eat();
    d.Sound();
    }

}