interface remote{
     void Switch();
     void sound();

}

class TV implements remote{
    public void Switch(){
        System.out.println("switch ON/OFF");

    }
    public void sound(){
         System.out.println("voice can be increased upto 100%");
    }
}

class setup implements remote{
    public void Switch(){
        System.out.println("switch ON/OFF");

    }
    public void sound(){
         System.out.println("voice can be increased upto 200%");
    }
}

class Main{
    public static void main(String args[]){
        remote r=new TV();
        r.Switch();
        r.sound();

        r=new setup();
        r.Switch();
        r.sound();
    }
}