import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P07_ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        
        boolean isBeforeValueSwap = false;
        do{
            isBeforeValueSwap = !isBeforeValueSwap;
            
            System.out.println(isBeforeValueSwap ? "Before:" : "After:");
            System.out.println("a = " + num1);
            System.out.println("b = " + num2);
    
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        } while (isBeforeValueSwap);
    }
}
