import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P09_ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] chars = new char[3];
        char[] charsReversed = new char[3];
        for (int i = 0; i < chars.length ; i++) {
            int j = chars.length-1 - i;
            chars[i] = scan.nextLine().charAt(0);
            charsReversed[j] = chars[i];
        }
        System.out.println(String.copyValueOf(charsReversed));
    }
}
