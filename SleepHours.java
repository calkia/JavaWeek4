//Kiana Tjon - 3/5/35 - Sleep Hours
import java.util.*;
//Birthday = 1990-9-8 Date = 2006-2-12
public class SleepHours {
    public static void main(String[] args) {
        int birthYear;
        int birthMonth;
        int birthDay;
        int year;
        int month;
        int day;
        int daysAliveYear;
        int daysAliveMonth;
        int daysAlive;
        int hourSleep;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        birthYear = input.nextInt();
        System.out.print("Month: ");
        birthMonth = input.nextInt();
        System.out.print("Day: ");
        birthDay = input.nextInt();

        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        year = input.nextInt();
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Day: ");
        day = input.nextInt();

        daysAliveYear = ((year-birthYear)*365);
        daysAliveMonth = ((month-birthMonth)*30);
        daysAlive = (day-birthDay)+daysAliveMonth+daysAliveYear;
        hourSleep = daysAlive*8;


        System.out.println("Your have been alive for "+daysAlive+" days.");
        System.out.println("You have slept for "+hourSleep+" hours.");

   }
}
