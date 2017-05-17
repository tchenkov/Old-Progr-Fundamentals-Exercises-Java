import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 17.05.2017 г..
 */
public class P06_MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        
        BigDecimal numberPowered = getNumberPoweredBy(number, power);
        
        System.out.println(customRound(numberPowered));
    }
    
    static BigDecimal getNumberPoweredBy(double number, int poweredBy) {
        return new BigDecimal(String.valueOf(Math.pow(number, poweredBy)));
    }
    
    static String customRound(BigDecimal number){
        String numberString = number.setScale(12,BigDecimal.ROUND_HALF_UP).toString();
        int index = 15 - numberString.indexOf('.');
        number = new BigDecimal(numberString).setScale(index,BigDecimal.ROUND_HALF_UP).setScale(12, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        double numDouble = Double.parseDouble(number.toString());
        boolean remainder = numDouble % 1 == 0;
        return remainder ? String.format("%.0f", numDouble) : number.toString();
    }
}
