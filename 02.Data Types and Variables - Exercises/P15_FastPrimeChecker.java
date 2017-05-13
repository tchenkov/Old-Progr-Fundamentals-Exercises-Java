import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P15_FastPrimeChecker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = Integer.parseInt(scan.nextLine());
    
        for (int currentNumber = 2; currentNumber <= maxNumber; currentNumber++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(currentNumber); j++) {
                if (currentNumber % j == 0){
                    isPrime = false;
                    break;
                }
            }
    
            System.out.println(MessageFormat.format("{0} -> {1}", currentNumber, isPrime ? "True" : "False"));
        }
    }
}
