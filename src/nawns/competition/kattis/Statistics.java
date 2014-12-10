package nawns.competition.kattis;

import java.util.Scanner;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class Statistics {
    public static void main(String[] args) {
        int k = 1;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int x[] = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scan.nextInt();
            }
            System.out.println("Case " + k + ": " + min(x) + " " + max(x) + " " + (max(x) - min(x)));
            k++;
        }
    }

    private static int min(int[] x) {
        int k = Integer.MAX_VALUE;
        for (int i : x) {
            if (i < k)
                k = i;
        }
        return k;
    }
    private static int max(int[] x) {
        int k = Integer.MIN_VALUE;
        for (int i : x) {
            if (i > k)
                k = i;
        }
        return k;
    }

}
