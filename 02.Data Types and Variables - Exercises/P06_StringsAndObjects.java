import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P06_StringsAndObjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        
        myString myFirstString = new myString();
        myFirstString.setStringValue(string1 + " " + string2);
        
        String string3 = myFirstString.getStringValue();
        
        System.out.println(string3);
    }
}

class myString {
    String stringValue;
    
    public String getStringValue() {
        return stringValue;
    }
    
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
