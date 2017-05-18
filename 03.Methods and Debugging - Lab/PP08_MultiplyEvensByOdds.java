import java.util.Scanner;

/**
 * Created by todor on 18.05.2017 г..
 */
public class PP08_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intNumber = Integer.parseInt(scan.nextLine());
        getMultipleOfEvensAndOdds(intNumber);
    }
    
    static void getMultipleOfEvensAndOdds(int numb){
        int evenSum = getEvenDigitsSum(numb);
        int oddSum = getOddDigitsSum(numb);
        System.out.println(evenSum * oddSum);
    }
    
    static int getEvenDigitsSum(int num){
        num = Math.abs(num);
        int sum = 0;
        while (num > 0){
            int remainder = num % 10;
            if (remainder % 2 == 0){
                sum += remainder;
            }
            num /= 10;
        }
        return sum;
    }
    
    static int getOddDigitsSum(int num){
        num = Math.abs(num);
        int sum = 0;
        while (num > 0){
            int remainder = num % 10;
            if (remainder % 2 == 1){
                sum += remainder;
            }
            num /= 10;
        }
        return sum;
    }
}
