public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
//        the matrix is symmetrical of x axis, with positive and negative region for k.
        long[][] t = new long[n + 1][n * 2 + 1];
        if (k > n || k < -n) return 0;
        t[0][n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j <= n + i; j++) {
//                StdOut.println(i + "," + j);
//                use the fact that on the diagonal line is 1 deducting the formula
                if (j == n - i || j == n + i) t[i][j] = 1;
                else t[i][j] = t[i - 1][j - 1] + t[i - 1][j] + t[i - 1][j + 1];
            }
        }
//        StdOut.println(t);
        return t[n][n + k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }

}
