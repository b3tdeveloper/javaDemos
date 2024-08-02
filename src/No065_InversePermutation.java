/******************************************************************************
 *  Compilation:  javac InversePermutation.java
 *  Execution:    java InversePermutation 5 0 2 3 1 4
 *
 *  Read in a permutation from the command line and print out the inverse
 *  permutation.
 *
 *    % java InversePermutation 5 0 2 3 1 4
 *    1 4 2 3 5 0
 *
 ******************************************************************************/

public class No065_InversePermutation {
    public static void main(String[] args){
        int n = args.length;

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        //Between line 11 and line 24, I can make it more effective with the code starting from line 26.
        boolean[] exists = new boolean[n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                if(a[i] == j && !exists[j]) {
                    exists[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i ++){
            if(!exists[i]){
                throw new RuntimeException("Input is not a permutation.");
            }
        }

        /*
        // check if valid
        boolean[] exists = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 || a[i] >= n || exists[a[i]])
                throw new RuntimeException("Input is not a permutation.");
            exists[a[i]] = true;
        }
        * */

        int[] b = new int[n];

        for (int i = 0; i < n; i ++){
            b[a[i]] = i;
        }

        for (int i = 0; i < n; i ++){
            System.out.print(a[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < n; i ++){
            System.out.print(b[i] + " ");
        }

    }
}
