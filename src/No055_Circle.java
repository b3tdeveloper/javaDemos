/******************************************************************************
 *  Compilation:  javac Circle.java
 *  Execution:    java Circle n
 *
 *  Prints out a circle of radius n like the one below.
 *
 *  % java Circle 5
 *  . . . . . * . . . . .
 *  . . * * * * * * * . .
 *  . * * * * * * * * * .
 *  . * * * * * * * * * .
 *  . * * * * * * * * * .
 *  * * * * * * * * * * *
 *  . * * * * * * * * * .
 *  . * * * * * * * * * .
 *  . * * * * * * * * * .
 *  . . * * * * * * * . .
 *  . . . . . * . . . . .
 *
 ******************************************************************************/

public class No055_Circle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print("  ");
            }
            System.out.println();
        }

    }
}
