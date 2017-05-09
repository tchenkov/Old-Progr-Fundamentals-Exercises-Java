import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P02_PracticeFloatingPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal bigDecimalNum1 = new BigDecimal(scan.nextLine());
        double doubleNum1 = Double.parseDouble(scan.nextLine());
        BigDecimal bigDecimalNum2 = new BigDecimal(scan.nextLine());
    
        System.out.println(bigDecimalNum1);
        System.out.println(doubleNum1);
        System.out.println(bigDecimalNum2);
        
    }
}
