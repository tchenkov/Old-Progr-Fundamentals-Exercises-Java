import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 24.04.2017 г..
 */
public class P02_CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal radius = new BigDecimal(scan.nextLine());
        String area = radius.multiply(radius).multiply(new BigDecimal(Math.PI)).setScale(12,BigDecimal.ROUND_HALF_UP).toString();
        int index = 15 - area.indexOf('.');
        area = new BigDecimal(area).setScale(index,BigDecimal.ROUND_HALF_UP).setScale(12, BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(area);
    }
}
