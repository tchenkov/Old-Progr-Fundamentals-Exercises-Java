import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 24.04.2017 г..
 */
public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCount = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < numCount; i++){
            sum = sum.add(new BigDecimal(scan.nextLine()));
        }
        System.out.println(sum.stripTrailingZeros().toString());
    }
}
