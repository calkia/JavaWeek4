//Kiana Tjon - 2/27/25 - Grade Average

import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class TempConverter {
    public static void main(String[] args) {
    double Fahrenheit;
    double Celsius;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Fahrenheit temp: ");
    Fahrenheit = input.nextDouble();
    Celsius = 5/9*(Fahrenheit-32);
    System.out.println("Your Celsius temp is: "+ Celsius);
    }
    
}
