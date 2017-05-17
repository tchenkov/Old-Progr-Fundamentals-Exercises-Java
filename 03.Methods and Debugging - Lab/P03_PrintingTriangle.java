import java.util.Scanner;

/**
 * Created by todor on 17.05.2017 г..
 */
public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberTriangleSize = Integer.parseInt(scan.nextLine());
        printNumberTriangle(numberTriangleSize);
    }
    
    static void printNumberTriangle(int endNumber){
        final int START_NUM = 1;
        for (int i = START_NUM; i <= endNumber; i++) {
            printNumberLine(START_NUM, i);
        }
        for (int i = endNumber - 1; i >= START_NUM; i--) {
            printNumberLine(START_NUM, i);
        }
    }
    
    static void printNumberLine (int startNum, int endNum){
        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
