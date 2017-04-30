import java.util.Scanner;

/**
 * Created by todor on 24.04.2017 г..
 */
public class P04_Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        int elevatorCapacity = Integer.parseInt(scan.nextLine());
        
        if (peopleCount < elevatorCapacity){
            System.out.println(1);
            return;
        }
        int elevatorCourses = (int) Math.ceil((double)peopleCount/elevatorCapacity);
        System.out.println(elevatorCourses);
    }
}
