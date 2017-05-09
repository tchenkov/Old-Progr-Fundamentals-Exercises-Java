import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P05_BooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean boolean1 = Boolean.parseBoolean(scan.nextLine());
        System.out.println(boolean1 ? "Yes" : "No");
    }
}
