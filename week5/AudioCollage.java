public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = alpha * a[i];
        }
        return c;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[a.length - 1 - i] = a[i];
        }
        return c;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        for (int i = 0; i < b.length; i++)
            c[a.length + i] = b[i];
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int al = a.length;
        int bl = b.length;
        double[] c;
        if (al > bl) {
            c = new double[al];

            for (int i = 0; i < al; i++) c[i] = a[i];

            for (int i = 0; i < bl; i++) c[i] = c[i] + b[i];

        } else {
            c = new double[bl];

            for (int i = 0; i < bl; i++) c[i] = b[i];

            for (int i = 0; i < al; i++) c[i] = c[i] + a[i];
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int n = (int) (a.length / alpha);
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[(int) (i * alpha)];
        }
        return c;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] A = new double[44100];
        double[] B = new double[44100];

        A = StdAudio.read("beatbox.wav");
        B = StdAudio.read("chimes.wav");

        double alpha = 1.5;

        StdAudio.play(amplify(A, alpha));
        StdAudio.play(reverse((A)));
        StdAudio.play(merge(A, B));
        StdAudio.play(mix(A, B));
        StdAudio.play(changeSpeed(A, alpha));

    }

}
