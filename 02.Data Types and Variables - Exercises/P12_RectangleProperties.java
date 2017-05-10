import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P12_RectangleProperties {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rectangleSideA = Double.parseDouble(scan.nextLine());
        double rectangleSideB = Double.parseDouble(scan.nextLine());
        
        double rectanglePerimeter = 2* (rectangleSideA + rectangleSideB);
        double rectangleArea = rectangleSideA * rectangleSideB;
        double rectangleDiagonal = Math.sqrt(Math.pow(rectangleSideA, 2) + Math.pow(rectangleSideB, 2));
    
        System.out.println(intOrDecimal(rectanglePerimeter));
        System.out.println(intOrDecimal(rectangleArea));
        System.out.println(intOrDecimal(rectangleDiagonal));
    }
    
    static String intOrDecimal (double num){
        return (num == (double) ((int) num)) ? String.valueOf((int) num) : customRound(new BigDecimal(String.valueOf(num)));
    }
        
    static String customRound (BigDecimal num){
        int intCount = 0;
        if (num.toString().charAt(0) != '0'){
            intCount = num.toString().replace(",", ".").indexOf(".");
            return num.setScale(15-intCount, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        }
        return num.setScale(7-intCount, BigDecimal.ROUND_CEILING).stripTrailingZeros().toString();
    }
}
