public class ShannonEntropy {
    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int[] values = new int[m + 1];
        int count = 0;
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            values[i]++;
            count++;
        }

        double e = 0.0;
        for (int i = 1; i <= m; i++) {
            if (values[i] == 0) {
                e = e + 0.0;
            } else {
                double p = (double) values[i] / count;
                double temp = p * Math.log(p) / Math.log(2);
                e = e - temp;
            }
        }
        StdOut.print(e);
        
    }
}
