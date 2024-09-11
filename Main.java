class car {
	
	String model;
	int year;
    String color;
   
	public car(String Model , int Year ){
         this.model = Model;
         this.year =Year;

	}

	public car(String Model , int Year, String Color){
         this.model = Model;
         this.year =Year;
         this.color= Color;
       

	}


}
 public class Main{
  public static void main(String args[]){
     car Car1=new car("toyota" , 2004);
     System.out.println("first car detail:" + Car1.model + " " + Car1.year );
      car Car2=new car("toyota2" , 2005 , "brown");
     System.out.println("first car detail:" + Car2.model + " " + Car2.year +" " +Car2.color );
  }
 }