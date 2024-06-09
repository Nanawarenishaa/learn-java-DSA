import java.util.Scanner;

class factorialNo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scanner.nextInt();

        int factorial = 1 ;
        for(int i = 1; i<=num ; i ++){
            factorial *= i;

        }
       System.out.println("factorial of " + num + "factorial");
       scanner.close();
    }
}