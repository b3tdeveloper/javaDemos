/******************************************************************************
 *  Compilation:  javac FunctionGrowth.java
 *  Execution:    java FunctionGrowth
 *
 *  Print out ln n, n, n log n, n^2, n^3 for n = 2, 4, 8, ..., 2048.
 *
 *  % java FunctionGrowth
 *  log n   n       n log n n^2     n^3
 *  0       2       1       4       8
 *  1       4       5       16      64
 *  2       8       16      64      512
 *  2       16      44      256     4096
 *  3       32      110     1024    32768
 *  4       64      266     4096    262144
 *  4       128     621     16384   2097152
 *  5       256     1419    65536   16777216
 *  6       512     3194    262144  134217728
 *  6       1024    7097    1048576 1073741824
 *  7       2048    15615   4194304 8589934592
 *
 ******************************************************************************/

public class No035_FunctionGrowth {
    public static void main(String[] args){

        System.out.println("Log n \t\tn \t\tn log n \tn ^ 2 \t\tn ^ 3");

        for (long n = 2; n<= 2048; n*=2){
            long logn = (long) Math.log(n);
            long nlogn = n * (long) Math.log(n);
            long pow2 = n * n;
            long pow3 = n * n * n;
            System.out.println(logn + " \t\t" + n + " \t\t" + nlogn + " \t\t" + pow2 + " \t\t" + pow3);
        }

    }
}
