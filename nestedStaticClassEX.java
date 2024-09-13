class OuterClass{
     int num1=200;
     static int num2=250;
	static class nestedStaticClass{
            void display(){
             //System.out.println("Hello world!"+num1);
             System.out.println("Hello world! "+num2);
            }

	}
	 void showMessage(){
             	System.out.println("Hello world! "+num1);
             }
}
      public class nestedStaticClassEX{
      public static void main(String args[]){
       OuterClass.nestedStaticClass nested = new OuterClass.nestedStaticClass();
       nested.display();
       OuterClass OC = new OuterClass();
       OC.showMessage();
      }
      }