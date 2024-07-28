/******************************************************************************
 *  Compilation:  javac BowTie.java
 *  Execution:    java BowTie n
 *
 *  Prints out a bowtie of "radius" n like the one below.
 *
 *  % java BowTie 3
 *  * . . . . . *
 *  * * . . . * *
 *  * * * . * * *
 *  * * * * * * *
 *  * * * . * * *
 *  * * . . . * *
 *  * . . . . . *
 *
 ******************************************************************************/

public class No053_BowTie {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i <= j*j) System.out.print("* ");
                else            System.out.print(". ");
            }
            System.out.println();
        }
    }
}

/* Easy way

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i <= j*j) System.out.print("* ");
                else            System.out.print(". ");
            }
            System.out.println();
        }

*/