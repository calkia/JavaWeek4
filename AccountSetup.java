//Kiana Tjon - 3/3/25 - Account Setup
import java.util.*;

public class AccountSetup{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your password is " + password);
    }
}