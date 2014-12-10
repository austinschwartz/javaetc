package nawns.interview.dp;

/**
 * Created by nonis_000 on 12/7/2014.
 */
public class GridPath {

    public static void main(String[] args) {
        System.out.println(numPaths(5, 5));
        System.out.println(numPathsDP(5, 5));
    }
    // Returns count of possible paths to reach cell at row number m and column
    // number n from the topmost leftmost cell (cell at 1, 1)
    private static int numPaths(int m, int n) {
        if (n == 1 || m == 1)
            return 1;
        return numPaths(m-1, n) + numPaths(m, n-1);
    }

    private static int numPathsDP(int m, int n) {
        int[][] count = new int[m][n];

        for (int i = 0; i < m; i++)
            count[i][0] = 1;
        for (int j = 0; j < n; j++)
            count[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                count[i][j] = count[i-1][j] + count[i][j-1];
            }
        }
        return count[m-1][n-1];
    }
}
