//Kiana Tjon - 3/5/25 - Time Conversion
import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        int time;
        int hours;
        int minutes;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        time = input.nextInt();
        hours = time/60;
        minutes = time%60;

        if (minutes < 10){
            System.out.println("The time is: "+hours+":0"+minutes);
        }
        else{
            System.out.println("The time is: "+hours+":"+minutes);
        }

    }
}
