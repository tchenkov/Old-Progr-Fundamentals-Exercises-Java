import java.util.Scanner;

/**
 * Created by todor on 24.04.2017 г..
 */
public class P01_CenturiesToMinutes {
    public static void main(String[] args) {
        final double daysPerYear = 365.242;
        Scanner scan = new Scanner(System.in);
        int centuries = Integer.parseInt(scan.nextLine());
        int years = centuries * 100;
        int days = (int) Math.round(years * daysPerYear);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes%n", centuries, years, days, hours, minutes);
    }
}
