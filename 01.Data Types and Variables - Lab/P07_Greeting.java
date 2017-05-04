import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 3.05.2017 г..
 */
public class P07_Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
    
        System.out.println(MessageFormat.format("Hello, {0} {1}. You are {2} years old.", firstName, lastName, age));
    }
}
