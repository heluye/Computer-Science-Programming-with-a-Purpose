
/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int m = Integer.parseInt(args[0]);
        int[] a = new int[n-1];
        int[] s = new int[n-1];

        for (int i=0;i<n-1;i++){
            a[i] = Integer.parseInt(args[i+1]);
        }

        s[0]=a[0];
        for (int j=1;j<n-1;j++){
            s[j]=s[j-1]+a[j];
        }

        for (int k=0; k<m; k++){
            int r = (int) (Math.random()*s[n-2]);
            for (int j=0; j<n-1;j++){
                if(r<s[j]){
                    System.out.print(j+1+" ");
                    break;
                }
            }
        }

    }
}
