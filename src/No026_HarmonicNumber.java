/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 *
 *  % java HarmonicNumber 10
 *  2.9289682539682538
 *
 *  java HarmonicNumber 1000
 *  7.485470860550343
 *
 *  % java HarmonicNumber 10000
 *  9.787606036044348
 *
 ******************************************************************************/
public class No026_HarmonicNumber {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;

        for (int i = 1; i <= n; i++){
            sum = sum + 1.0 / i;
        }

        System.out.println(sum);

    }
}
