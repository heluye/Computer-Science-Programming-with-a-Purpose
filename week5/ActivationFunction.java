public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x < 0) return 0;
        else if (x == 0) return (double) 1 / 2;
        else return 1;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double denom = 1 + Math.exp(-x);
        return (double) 1 / denom;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double nom = Math.exp(x) - Math.exp(-x);
        double denom = Math.exp(x) + Math.exp(-x);
        return nom / denom;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double denom = 1 + Math.abs(x);
        return x / denom;
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= -2) return -1;
        else if (-2 < x && x < 0) return x + Math.pow(x, 2) / 4;
        else if (2 > x && x >= 0) return x - Math.pow(x, 2) / 4;
        else return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.print("heaviside(" + x + ")\t = \t" + heaviside(x) + "\n");
        StdOut.print("sigmoid(" + x + ")\t = \t" + sigmoid(x) + "\n");
        StdOut.print("tanh(" + x + ")\t = \t" + tanh(x) + "\n");
        StdOut.print("softsign(" + x + ")\t = \t" + softsign(x) + "\n");
        StdOut.print("sqnl(" + x + ")\t = \t" + sqnl(x) + "\n");
    }

}
