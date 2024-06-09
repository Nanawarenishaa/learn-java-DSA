import java.util.Scanner;

public class factorialNo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scanner.nextInt();

        long factorial = 1 ;
        for(int i = 1; i<=num ; i ++){
            factorial *= i;

        }
       System.out.println("factorial of " + num + " is " + factorial);
       scanner.close();
    }
}
  
class factorialNumber{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter a number : ");
       int num = scanner.nextInt();
       long factorial= factorial(num);
       System.out.println("factorial of " + num + " : " + factorial);
      scanner.close();
    }
    public static long factorial(int num){
        if (num == 0){
            return 1;
        }
        return num* factorial(num-1);
    }
}