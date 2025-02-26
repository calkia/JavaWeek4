//Kiana Tjon - 2/25/25 - this is a file that will isolate what place each digit is in
public class Digits{
    public static void main(String[] args) {
        int num;
        int hundreds;
        int tens;
        int ones;
        int thousands;
        num = 1258;
        ones = num%10;
        tens = (num/10)%10;
        hundreds = (num/100)%10;
        thousands = (num/1000)%10;
        System.out.println("The thousands-place digit is "+thousands);
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " +tens);
        System.out.println("The ones-place digit is: " +ones);
    }
}
