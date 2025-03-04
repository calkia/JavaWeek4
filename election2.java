//Kiana Tjon - 3/4/25 - election
import java.util.*;
// Aubrey NY: 314159 - NJ: 89008 - CT: 213451
// Martinez: NY: 271860 - NJ: 121032 - CT: 231034 

public class election2 {
    public static void main(String[] args) {
        String canidate1;
        String canidate2;
        int can1NY;
        int can1NJ;
        int can1CT;
        int can2NY;
        int can2NJ;
        int can2CT;
        int can1Total;
        int can2Total;
        int total;
        double can1Percent;
        double can2Percent;

        Scanner input = new Scanner(System.in);
        System.out.print("Who is the first canidate? ");//Awbrey
        canidate1 = input.nextLine();
        System.out.print("What are their New York Votes? ");
        can1NY = input.nextInt();
        System.out.print("What are their New Jersey Votes? ");
        can1NJ = input.nextInt();
        System.out.print("What are their Connecticut Votes? ");
        can1CT = input.nextInt();
        input.nextLine();
        System.out.print("Who is the second canidate? ");//Martinez
        canidate2 = input.nextLine();
        System.out.print("What are their New York Votes? ");
        can2NY = input.nextInt();
        System.out.print("What are their New Jersey Votes? ");
        can2NJ = input.nextInt();
        System.out.print("What are their Connecticut Votes? ");
        can2CT = input.nextInt();

        input.close();


        can1Total = can1NY + can1NJ + can1CT;
        can2Total = can2NY + can2NJ + can2CT;
        total = can1Total+can2Total;
        can1Percent = ((double)can1Total/(double)total)*100;
        can2Percent = ((double)can2Total/(double)total)*100;

        System.out.println("Canidate\t\tVotes\tPercentage");
        System.out.println(canidate1+"\t\t\t"+can1Total +"\t"+can1Percent);
        System.out.println(canidate2+"\t\t"+can2Total +"\t"+can2Percent);
        System.out.println("TOTAL VOTES: \t\t"+total);
    }
}
