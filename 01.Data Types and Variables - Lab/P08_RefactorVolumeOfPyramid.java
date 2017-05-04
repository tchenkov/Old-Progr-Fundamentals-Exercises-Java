import java.util.Scanner;

/**
 * Created by todor on 3.05.2017 г..
 */
public class P08_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());
        double pyramidVolume= (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", pyramidVolume);
    }
}
