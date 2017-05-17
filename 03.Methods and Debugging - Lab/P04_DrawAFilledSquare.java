import java.util.Scanner;

/**
 * Created by todor on 17.05.2017 г..
 */
public class P04_DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareSize = Integer.parseInt(scan.nextLine());
        drawSquare(squareSize);
    }
    
    static void drawSquare(int size){
        printSquareTopBottom(size);
        printSquareBody(size);
        printSquareTopBottom(size);
    }
    
    static void printSquareTopBottom(int size){
        System.out.println(stringRepeat("-", size *2));
    }
    
    static void printSquareBody(int size){
        for (int i = 0; i < size - 2; i++) {
            System.out.printf("-%s-%n", stringRepeat("\\/", size - 1));
        }
    }
    
    static String stringRepeat(String strToRepeat, int repeatCount){
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            finalString = finalString.append(strToRepeat);
        }
        return finalString.toString();
    }
}
