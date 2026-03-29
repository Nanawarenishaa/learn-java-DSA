class A {

void msg(){
  System.out.println("welcome back..");
}

void show(){
System.out.println("stay strong...🤝");
}

}

 class B extends A {
 
void msg(){
  super.msg();
  System.out.println("nisha!!");


}
}

public class C {
   public static void main(String[] args){
   B child = new B();
   child.msg();
   child.show();
}}
   