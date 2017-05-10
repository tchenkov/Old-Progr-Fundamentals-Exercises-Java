import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P14_IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(scan.nextLine());
        System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
        System.out.println(Integer.toBinaryString(decimalNumber));
    }
}
