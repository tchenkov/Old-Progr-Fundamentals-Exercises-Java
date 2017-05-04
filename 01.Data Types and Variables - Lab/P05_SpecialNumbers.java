import java.util.Scanner;

/**
 * Created by todor on 24.04.2017 г..
 */
public class P05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scan.nextLine());
        
        for (int i = 1 ; i <= numbersCount; i++){
            int currentNumDigitSum = digitSum(i);
            boolean isCurrentNumSpecial = currentNumDigitSum == 5 || currentNumDigitSum == 7 || currentNumDigitSum == 11;
            System.out.println(i + " -> " + isCurrentNumSpecial);
        }
    }
    
    static int digitSum (int number){
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        return sum;
    }
}
