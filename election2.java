//Kiana Tjon - 3/4/25 - election
import java.util.*;
// Aubrey NY: 314159 - NJ: 89008 - CT: 213451
// Martinez: NY: 271860 - NJ: 121032 - CT: 231034 

public class election2 {
    public static void main(String[] args) {
        String Canidate1;
        String Canidate2;
        int AwbNY = 314159;
        int AwbNJ = 89008;
        int AwbCT = 213451;
        int MartNY = 271860;
        int MartNJ = 121032;
        int MartCT = 231034;
        int AwbTotal;
        int MartTotal;
        int Total;
        double AwbPercent;
        double MartPercent;

        Scanner input = new Scanner(System.in);
        System.out.print("Who is the first canidate? ");
        Canidate1 = input.nextLine();
        System.out.print("Who is the second canidate? ");
        Canidate2 = input.nextLine();


        AwbTotal = AwbNY + AwbNJ + AwbCT;
        MartTotal = MartNY + MartNJ + MartCT;
        Total = AwbTotal+MartTotal;
        AwbPercent = ((double)AwbTotal/(double)Total)*100;
        MartPercent = ((double)MartTotal/(double)Total)*100;

        System.out.println("Canidate\t\tVotes\tPercentage");
        System.out.println(Canidate1+"\t\t\t"+AwbTotal +"\t"+AwbPercent);
        System.out.println(Canidate2+"\t\t"+MartTotal +"\t"+MartPercent);
    }
}
