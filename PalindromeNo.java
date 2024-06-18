public class PalindromeNo {
    public static void main(String[] args) {
        int n = 12321 , sum = 0;
        int temp = n , r ;
        
        while( n > 0 ){
            r = n % 10 ;
            sum = (sum * 10 ) + r ;
            n = n / 10;
        }
        if( temp == sum){
            System.out.println(temp + " " + "is a Palindrome Number");
        }else {
            System.out.println(temp + " " + "is not a Palindrome Number");
        }
    }
}
