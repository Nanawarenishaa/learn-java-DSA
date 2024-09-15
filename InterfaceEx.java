interface vehicle {
abstract void start();
	abstract void stop();
	int MAX_SPEED=120;

  default void displayMaxSpeed(){
     System.out.println("Max speed is:" + MAX_SPEED + "Km/h");
  }
   static void service(){
    System.out.println("Vehicle service require .");
   }

}
 class Car implements vehicle{
  public void start(){
    System.out.println("Car is starting .");
   }
  public void stop(){
    System.out.println("Car is stopping . ");
   }
 }
public class InterfaceEx {
	public static void main(String args[]){
	  Car mycar =new Car();
	  mycar.start();
	  mycar.stop();
	  mycar.displayMaxSpeed();
	  vehicle.service();


	}
}