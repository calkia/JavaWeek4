//Kiana Tjon - 3/4/25 - election
import java.util.*;
// Aubrey NY: 314159 - NJ: 89008 - CT: 213451
// Martinez: NY: 271860 - NJ: 121032 - CT: 231034 

public class election {
    public static void main(String[] args) {
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

        AwbTotal = AwbNY + AwbNJ + AwbCT;
        MartTotal = MartNY + MartNJ + MartCT;
        Total = AwbTotal+MartTotal;
        AwbPercent = ((double)AwbTotal/(double)Total)*100;
        MartPercent = ((double)MartTotal/(double)Total)*100;

        System.out.println("Canidate\t\tVotes\tPercentage");
        System.out.println("Awbrey\t\t\t"+AwbTotal +"\t"+AwbPercent);
        System.out.println("Martinez\t\t"+MartTotal +"\t"+MartPercent);
    }
}
