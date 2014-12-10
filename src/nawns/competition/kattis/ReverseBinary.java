package nawns.competition.kattis;

/**
 * Created by nonis_000 on 11/26/2014.
 */
public class ReverseBinary {
    public static Integer reverse(Integer a) {
        System.out.println(a.byteValue());
        return a;
    }

    public static void main(String[] args) {
        Integer a = 13;
        System.out.println(reverse(a));

        Integer b = 47;
        System.out.println(reverse(b));
    }
}
