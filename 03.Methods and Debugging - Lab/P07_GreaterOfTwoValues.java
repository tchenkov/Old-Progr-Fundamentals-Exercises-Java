import java.util.Scanner;

/**
 * Created by todor on 18.05.2017 г..
 */
public class P07_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dataType = scan.nextLine().toLowerCase();
        String firstInput = scan.nextLine();
        String secondInput = scan.nextLine();
        
        switch (dataType) {
            case "int":
                System.out.println(getMax(Integer.parseInt(firstInput), Integer.parseInt(secondInput)));
                break;
            case "char":
                System.out.println(getMax(firstInput.charAt(0), secondInput.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(firstInput, secondInput));
        }
    }
    
    static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
    
    static char getMax(char char1, char char2) {
        if (char1 > char2) {
            return char1;
        }
        return char2;
    }
    
    static String getMax(String str1, String str2) {
        return str1.compareTo(str2) >= 0 ? str1 : str2;
    }
}
