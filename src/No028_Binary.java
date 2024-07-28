/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *
 *  Prints out n in binary.
 *
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 *
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 ******************************************************************************/
public class No028_Binary {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        int a = 0;
        int b = 0;
        String tbin = "";

        while (n >= 1){
            b = n % 2;
            a = n / 2;
            n = a;
            tbin = b + tbin;
        }

        System.out.println(tbin);

    }
}
