package nawns.competition.kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by nonis_000 on 12/6/2014.
 */
public class JudgingTroubles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] lst = new String[n*2];
        for (int i = 0; i < 2*n; i++) {
            lst[i] = scan.nextLine();
        }
        System.out.println(judge(n, lst));

//        System.out.println(judge(5, new String[]{"correct", "wronganswer", "correct", "correct", "timelimit",
//                                                 "wronganswer", "correct", "timelimit", "correct", "timelimit"}));

    }

    private static int judge(int n, String[] lst) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(lst[i]))
                map.put(lst[i], map.get(lst[i]) + 1);
            else
                map.put(lst[i], 1);
        }
        HashMap<String, Integer> map2 = new HashMap<String,Integer>();
        for (int i = n; i < (2*n); i++) {
            if (map2.containsKey(lst[i]))
                map2.put(lst[i], map2.get(lst[i]) + 1);
            else
                map2.put(lst[i], 1);
        }
        int x = 0;
        for (String key : map.keySet()) {
            if (map2.containsKey(key))
                x += Math.min(map.get(key), map2.get(key));
        }
        return x;
    }

}
