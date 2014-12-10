package nawns.interview.dp;

/**
 * Given a matrix consisting of 0's and 1's, find the maximum size sub-matrix consisting of only 1's.
 *
 *
 *  0  1  1  0  1
    1  1  0  1  0
    0  1  1  1  0
    1  1  1  1  0
    1  1  1  1  1
    0  0  0  0  0
 The maximum square sub-matrix with all set bits is

     1  1  1
     1  1  1
     1  1  1
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[][] M = new int[][]{ { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
        System.out.println(findS(6, 5, M));
    }

    private static int findS(int i, int j, int[][] M) {
        int[][] S = new int[i][j];

        for (int k = 0; k < i; k++)
            S[k][0] = M[k][0];

        for (int l = 0; l < j; l++)
            S[0][l] = M[0][l];

        // i give up
        return 0;
    }
}
