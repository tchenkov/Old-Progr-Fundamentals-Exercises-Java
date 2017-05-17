import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 17.05.2017 г..
 */
public class P05_CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double triangleSideA = Double.parseDouble(scan.nextLine());
        double triangleHeightA = Double.parseDouble(scan.nextLine());
        double triangleArea = getTriangleArea(triangleSideA, triangleHeightA);
    
        DecimalFormat df = new DecimalFormat("#.###############");
        System.out.println(df.format(triangleArea));
    }
    
    static double getTriangleArea(double sideA, double heightA){
        return sideA * heightA /2;
    }
}
