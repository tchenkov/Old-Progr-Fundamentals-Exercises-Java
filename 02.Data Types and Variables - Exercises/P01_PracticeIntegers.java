import java.util.Scanner;

/**
 * Created by todor on 4.05.2017 г..
 */
public class P01_PracticeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num1 = Byte.parseByte(scan.nextLine());
        short num2 = Short.parseShort(scan.nextLine());
        short num3 = Short.parseShort(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());
        long num5 = Long.parseLong(scan.nextLine());
        int num6 = Integer.parseInt(scan.nextLine());
        long num7 = Long.parseLong(scan.nextLine());
    
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
