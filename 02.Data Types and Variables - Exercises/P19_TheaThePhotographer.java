import java.util.Scanner;

/**
 * Created by todor on 13.05.2017 г..
 */
public class P19_TheaThePhotographer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long picturesCount = Long.parseLong(scan.nextLine());
        long filterTimePerPicture = Long.parseLong(scan.nextLine());
        byte goodPicturesPercentage  = Byte.parseByte(scan.nextLine());
        long filteredPicturesUploadTime = Long.parseLong(scan.nextLine());
        
        int picturesForUpload = (int) Math.ceil(picturesCount * goodPicturesPercentage / 100.0);
        
        // seconds
        long timeToCompleteS = picturesCount * filterTimePerPicture + picturesForUpload * filteredPicturesUploadTime;
        String timeToCompleteString = ":" + String.format("%02d",timeToCompleteS % 60);
        // minutes
        long timeToCompleteM = (timeToCompleteS - timeToCompleteS % 60)/ 60;
        timeToCompleteString = ":" + String.format("%02d",timeToCompleteM % 60) + timeToCompleteString;
        // hours
        long timeToCompleteH = (timeToCompleteM - timeToCompleteM % 60)/ 60;
        timeToCompleteString = ":" + String.format("%02d",timeToCompleteH % 24) + timeToCompleteString;
        // days
        long timeToCompleteD = (timeToCompleteH - timeToCompleteH % 24)/ 24;
        timeToCompleteString = String.valueOf(timeToCompleteD) + timeToCompleteString;
    
        System.out.println(timeToCompleteString);
    }
}