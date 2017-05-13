import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 13.05.2017 г..
 */
public class P18_DifferentIntegersSize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger numberBigInteger = new BigInteger(scan.nextLine());
    
        BigInteger zeroBigInteger = new BigInteger("0");
        BigInteger oneBigInteger = new BigInteger("1");
    
        BigInteger byteMinValue = new BigInteger(String.valueOf(Byte.MIN_VALUE));
        BigInteger byteMaxValue = new BigInteger(String.valueOf(Byte.MAX_VALUE));
        
        BigInteger shortMinValue = new BigInteger(String.valueOf(Short.MIN_VALUE));
        BigInteger shortMaxValue = new BigInteger(String.valueOf(Short.MAX_VALUE));
        
        BigInteger intMinValue = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        BigInteger intMaxValue = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        
        BigInteger longMinValue = new BigInteger(String.valueOf(Long.MIN_VALUE));
        BigInteger longMaxValue = new BigInteger(String.valueOf(Long.MAX_VALUE));
        
        boolean is_sByte = isInRange(numberBigInteger, byteMinValue, byteMaxValue);
        boolean isByte = isInRange(numberBigInteger, zeroBigInteger, byteMaxValue.add(byteMaxValue).add(oneBigInteger));
        boolean isShort = isInRange(numberBigInteger, shortMinValue, shortMaxValue);
        boolean is_uShort= isInRange(numberBigInteger, zeroBigInteger, shortMaxValue.add(shortMaxValue).add(oneBigInteger));
        boolean isInt = isInRange(numberBigInteger, intMinValue, intMaxValue);
        boolean is_uInt = isInRange(numberBigInteger, zeroBigInteger, intMaxValue.add(intMaxValue).add(oneBigInteger));
        boolean isLong = isInRange(numberBigInteger, longMinValue, longMaxValue);
        
        if (isLong){
            System.out.println(MessageFormat.format("{0} can fit in:", numberBigInteger.toString()));
            
            if (is_sByte){
                System.out.println("* sbyte");
            }
            if (isByte){
                System.out.println("* byte");
            }
            if (isShort){
                System.out.println("* short");
            }
            if (is_uShort){
                System.out.println("* ushort");
            }if (isInt){
                System.out.println("* int");
            }
            if (is_uInt){
                System.out.println("* uint");
            }
            System.out.println("* long");
        }
        else {
            System.out.println(MessageFormat.format("{0} can''t fit in any type", numberBigInteger.toString()));
        }
    }
    
    static boolean isInRange(BigInteger numberBigInteger, BigInteger byteMinValue, BigInteger byteMaxValue) {
        return !(byteMinValue.compareTo(numberBigInteger) == 1)
                                &&
                            !(byteMaxValue.compareTo(numberBigInteger) == -1);
    }
}
