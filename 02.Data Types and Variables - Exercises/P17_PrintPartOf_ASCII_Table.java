import java.util.Scanner;

/**
 * Created by todor on 13.05.2017 г..
 */
public class P17_PrintPartOf_ASCII_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startIndex = Integer.parseInt(scan.nextLine());
        int endIndex = Integer.parseInt(scan.nextLine());
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print("" + (char) i + " ");
        }
    }
}
