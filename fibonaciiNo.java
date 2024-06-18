public class fibonaciiNo {
    public static void main(String[] args) {
        int n1 = 0 , n2 = 1 ;
        int temp = 0 , count = 10;
        System.out.print(n1+" "+n2);
        for(int i = 2 ; i < count ; i++){
            temp = n1 + n2;
            System.out.print(" " +temp);
            n1 = n2;
            n2 = temp;
        }
    }
}
