public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        int count = 0;

        for (int i = 0; i < Math.pow(n, 1 / 3.0); i++) {
            double b;
            b = Math.pow((n - Math.pow(i, 3)), 1 / 3.0);
            if (Math.abs(b - Math.round(b)) <= 0.0000001) {
                count++;
            }
        }
        return (count == 4);
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.print(isRamanujan(n));
    }
}
