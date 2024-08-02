/******************************************************************************
 *  Compilation:  javac Permutation.java
 *  Execution:    java Permutation n
 *
 *  Prints a pseudorandom permution of the integers 0 through n-1.
 *
 *    % java Shuffle 6
 *    5 0 2 3 1 4
 *    . * . . . .
 *    . . . . * .
 *    . . * . . .
 *    . . . * . .
 *    . . . . . *
 *    * . . . . .
 *
 ******************************************************************************/

public class No068_Permutation {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        //Random numbers 0 - (n-1)
        int[] numbers = new int[n];
        boolean[] exist = new boolean[n];
        for(int i = 0; i < n; i ++){
            int random = (int) (Math.random() * n);
            while (true) {
                if (!exist[random]){
                    numbers[i] = random;
                    exist[random] = true;
                    break;
                }
                else {
                    random = (int) (Math.random() * n);
                }
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        //stars
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                if(i == numbers[j]) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }

    }
}
