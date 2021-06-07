/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("("+x+", "+y+")");
        while (Math.abs(x)+Math.abs(y)<r){
            double p = Math.random();
            if (p>0.75) x+=1;
            else if (p>0.5) x-=1;
            else if (p>0.25) y+=1;
            else y-=1;
            steps++;
            System.out.println("("+x+", "+y+")");
        }
        System.out.println("steps = "+steps);

    }
}
