import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P11_ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distanceInMeters = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int seconds = Integer.parseInt(scan.nextLine());
        double timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        BigDecimal metersPerSecond = new BigDecimal(String.valueOf(distanceInMeters / timeInSeconds));
        BigDecimal kmPerHour = new BigDecimal(String.valueOf((distanceInMeters/1000.0) / ( timeInSeconds/3600.0)));
        BigDecimal milesPerHour = new BigDecimal(String.valueOf((distanceInMeters/1609.0) / (timeInSeconds/3600.0)));
    
        System.out.println(customRound(metersPerSecond));
        System.out.println(customRound(kmPerHour));
        System.out.println(customRound(milesPerHour));
    }
    
    static String customRound (BigDecimal num){
        int intCount = 0;
        if (num.toString().charAt(0) != '0'){
            intCount = num.toString().replace(",", ".").indexOf(".");
            return num.setScale(7-intCount, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        }
        return num.setScale(7-intCount, BigDecimal.ROUND_CEILING).stripTrailingZeros().toString();
    }
}
