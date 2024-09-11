class car {
	
	String model;
	int year;
    String color;
	public car(String Model , int Year ){
         this.model = Model;
         this.year =Year;

	}

	public car(String Model , int Year, String Color ){
         this.model = Model;
         this.year =Year;
         this.color= Color;
	}


}
 public class Main{
  public static void main(String args[]){
     car Car1=new car("toyota" , 2004);
     System.out.printl("first car detail:" + Car1.Model + " " + Car1.Year );
      car Car2=new car("toyota" , 2004);
     System.out.printl("first car detail:" + Car2.Model + " " + Car2.Year );
  }
 }