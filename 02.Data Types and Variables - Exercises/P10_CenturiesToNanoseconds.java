import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by todor on 10.05.2017 г..
 */
public class P10_CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte centuries = Byte.parseByte(scan.nextLine());
        short years = (short) (centuries * 100);
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        String minutes = new BigInteger(String.valueOf(hours)).multiply(new BigInteger("60")).toString().trim();
        String seconds = new BigInteger(minutes).multiply(new BigInteger("60")).toString().trim();
        String milliseconds = new BigInteger(seconds).multiply(new BigInteger("1000")).toString().trim();
        String microseconds = new BigInteger(milliseconds).multiply(new BigInteger("1000")).toString().trim();
        String nanoseconds = new BigInteger(microseconds).multiply(new BigInteger("1000")).toString().trim();
    
        System.out.println(centuries + " centuries = " +
                        years + " years = " +
                        days + " days = " +
                        hours + " hours = " +
                        minutes + " minutes = " +
                        seconds + " seconds = " +
                        milliseconds + " milliseconds = " +
                        microseconds + " microseconds = " +
                        nanoseconds + " nanoseconds"
        );
    }
}
