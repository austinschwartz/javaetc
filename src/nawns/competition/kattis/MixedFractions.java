package nawns.competition.kattis;

import java.util.Scanner;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class MixedFractions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0)
                break;
            System.out.println(frac(a, b));
        }
    }

    private static String frac(int a, int b) {
        int x = 0;
        while (a >= b) {
            x++;
            a = a - b;
        }
        return "" + x + " " + a + " / " + b;
    }
}
