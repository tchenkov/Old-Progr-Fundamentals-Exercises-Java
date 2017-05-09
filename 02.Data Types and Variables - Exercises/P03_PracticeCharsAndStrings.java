import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P03_PracticeCharsAndStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        char char3 = scan.nextLine().charAt(0);
        String string2 = scan.nextLine();
    
        System.out.println(string1);
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(string2);
    }
}
