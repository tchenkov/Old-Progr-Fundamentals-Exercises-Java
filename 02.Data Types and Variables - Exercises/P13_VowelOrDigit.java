import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P13_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.nextLine().charAt(0);
        try {
            Integer.parseInt(String.valueOf(symbol));
            System.out.println("digit");
            return;
        }catch (NumberFormatException ex){
            boolean isVowel = symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i';
            if (isVowel){
                System.out.println("vowel");
                return;
            }
            System.out.println("other");
        }
    }
}
