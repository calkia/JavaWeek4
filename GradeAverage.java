//Kiana Tjon - 2/27/25 - Grade Average
import java.util.*;

public class GradeAverage {
    public static void main(String[] args) {
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        grade1 = input.nextInt();
        System.out.println("Enter a grade: ");
        grade2 = input.nextInt();
        System.out.println("Enter a grade: ");
        grade3 = input.nextInt();
        System.out.println("Enter a grade: ");
        grade4 = input.nextInt();
        System.out.println("Enter a grade: ");
        grade5 = input.nextInt();
        average = (grade1+grade2+grade3+grade4+grade5)/5.0;
        System.out.println("Your average is "+ average);
    }
}
