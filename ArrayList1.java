import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(4);
        num.add(5);
        num.add(10);
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num.addAll(0,num1);
        System.out.println(num1.contains(8));
        System.out.println(num1.indexOf(3));
        num1.clear();
        
      
        System.out.println(num1);
        for(int i=0; i < num.size() ; i++){
            System.out.print(num.get(i)+", ");
           
        }

    }
}