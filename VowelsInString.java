import java.util.Scanner;

public class VowelsInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        sc.close();
        
        for (int ch = 0; ch < input.length(); ch++) {
            char str = input.charAt(ch);
            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || 
    str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U') {
    System.out.print(str + " ");
}

        }
    }
}
