public class Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int max = 0;
        int consecutive = 0;
        int i = 0;
        String t = "CAG";
        while (i < (dna.length() - 2)) {
            String c = dna.substring(i, i + 3);
            if (c.equals(t)) {
                consecutive++;
                if (consecutive > max) max = consecutive;
                i += 3;
            } else {
                consecutive = 0;
                i++;
            }
        }
        return max;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        return s.replace("\n", "").replace("\t", "").replace(" ", "");
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats <= 9 || maxRepeats >= 181) return "not human\n";
        if (maxRepeats <= 35) return "normal\n";
        if (maxRepeats <= 39) return "high risk\n";
        return "Huntington's\n";

    }

    // Sample client (see below).
    public static void main(String[] args) {
        In in = new In(args[0]);
        String s = in.readAll();
        String dna = removeWhitespace(s);
        int r = maxRepeats(dna);
        System.out.println("max repeats = " + r);
        System.out.println(diagnose(r));

    }
}
