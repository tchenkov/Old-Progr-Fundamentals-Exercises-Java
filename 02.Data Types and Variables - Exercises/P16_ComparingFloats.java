import java.util.Scanner;

/**
 * Created by todor on 13.05.2017 г..
 */
public class P16_ComparingFloats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        
        final double eps = 0.000001;
    
        System.out.println((Math.abs(num1 - num2) < eps) ? "True" : "False");
    }
}
