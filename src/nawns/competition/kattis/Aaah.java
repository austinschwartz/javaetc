package nawns.competition.kattis;

import java.util.Scanner;

/**
 * Created by nonis_000 on 11/26/2014.
 */
public class Aaah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in1 = scan.nextLine();
        String in2 = scan.nextLine();

        if (in1.length() < in2.length()) System.out.println("no");
        else
            System.out.println("go");
    }
}
