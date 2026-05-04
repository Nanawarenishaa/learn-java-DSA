class Pen{
    String color;
    float price;


    // Pen(){
    //     System.err.println("constructor called!!");  // unparametrized constructor
    // }

    Pen(String color,float price) // parameterized constructor
    {
       this.color = color;
        this.price = price;
    }
    void display(){
        System.out.println(this.price);
        System.out.println(this.color);
    }
}


public class Opps {
    public static void main(String args[]){
        Pen pen1 = new Pen("Black",10.5f);
        

        pen1.display();
       
    }
}
