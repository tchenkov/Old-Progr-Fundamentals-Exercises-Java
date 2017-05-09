import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P04_VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.decode(scan.nextLine()); // accepts values 0xFF
        //int num1 = Integer.parseInt(scan.nextLine().toLowerCase().replace("0x", ""), 16); // accepts values FF
        
        System.out.println(num1);
    }
}
