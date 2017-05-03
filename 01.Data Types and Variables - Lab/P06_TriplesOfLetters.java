import java.util.Scanner;

/**
 * Created by todor on 3.05.2017 г..
 */
public class P06_TriplesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lettersCount = Integer.parseInt(scan.nextLine()) + 'a';
    
        for (char i = 'a'; i < lettersCount; i++) {
            for (char j = 'a'; j < lettersCount; j++) {
                for (char k = 'a'; k < lettersCount; k++) {
                    String lettersString = "" + i + j + k;
                    System.out.println(lettersString);
                }
            }
        }
    }
}
