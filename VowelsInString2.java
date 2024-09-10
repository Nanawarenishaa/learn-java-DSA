import java.util.Scanner;

public class VowelsInString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();
        
       
        int[] vowelCount = new int[5];
        String vowels = "aeiou";
        
        String inputToLowerCase = input.toLowerCase();
        
        for (int i = 0; i < inputToLowerCase.length(); i++) {
            char ch = inputToLowerCase.charAt(i);
            
            switch (ch) {
                case 'a':
                    vowelCount[0]++;
                    System.out.println('a');
                    break;
                case 'e':
                    vowelCount[1]++;
                    System.out.println('e');
                    break;
                case 'i':
                    vowelCount[2]++;
                    System.out.println('i');
                    break;
                case 'o':
                    vowelCount[3]++;
                    System.out.println('o');
                    break;
                case 'u':
                    vowelCount[4]++;
                    System.out.println('u');
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Vowel counts:");
        for (int i = 0; i < vowels.length(); i++) {
            System.out.println(vowels.charAt(i) + ": " + vowelCount[i]);

        }
    }
}
