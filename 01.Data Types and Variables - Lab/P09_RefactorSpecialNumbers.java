import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 3.05.2017 г..
 * thanks to Hristo Nenkov for pointing out
 * C# booleans are starting with capital letter
 * Java booleans are starting with lower case letter
 */
public class P09_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scan.nextLine());
    
        for (int i = 1; i <= numbersCount; i++){
            int numDigitsSum = 0;
            int currentNum = i;
            
            while (currentNum > 0){
                numDigitsSum += currentNum % 10;
                currentNum /= 10;
            }
            
            String isNumSpecial = (numDigitsSum == 5) || (numDigitsSum == 7) || (numDigitsSum == 11)
                    ? "True" : "False";
            System.out.printf(MessageFormat.format("{0} -> {1}%n",i , isNumSpecial));
        }
    }
}
