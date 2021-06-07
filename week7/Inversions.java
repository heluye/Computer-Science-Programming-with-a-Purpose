public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int n = a.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) count++;
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        if (k > (long) n * (n - 1) / 2) {
            throw new IllegalArgumentException();
        }

        int[] a = new int[n];

        if (k == 0) {
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }
            return a;
        }

        if (k == n * (n - 1) / 2) {
            for (int i = 0; i < n; i++) {
                a[i] = n - 1 - i;
            }
            return a;
        }

        int pos = n - 1;
        int start = 0;
        int end = n - 1;
        while (start != end) {
            if (k >= pos) {
                a[start] = pos;
                k = k - pos;
                start++;
            } else {
                a[end] = pos;
                end--;
            }
            pos--;
        }
        return a;

    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int[] a = generate(n, k);

        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }

    }

}
