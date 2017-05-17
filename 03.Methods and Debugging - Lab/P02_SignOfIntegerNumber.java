import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by todor on 17.05.2017 г..
 */
public class P02_SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger intNum = new BigInteger(scan.nextLine());
        printSign(intNum);
    }
    
    static void printSign(BigInteger num){
        switch (num.compareTo(new BigInteger("0"))){
            case -1:
                System.out.printf("The number %s is negative.%n", num.toString());
                break;
            case 0:
                System.out.printf("The number 0 is zero.%n");
                break;
            case 1:
                System.out.printf("The number %s is positive.", num.toString());
        }
    }
}
