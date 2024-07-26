/******************************************************************************
 *  Compilation:  javac Diamond.java
 *  Execution:    java Diamond n
 *
 *  Prints out a (2n+1)-by-(2n+1) diamond like the one below.
 *
 *  % java Diamond 4
 *  . . . . * . . . .
 *  . . . * * * . . .
 *  . . * * * * * . .
 *  . * * * * * * * .
 *  * * * * * * * * *
 *  . * * * * * * * .
 *  . . * * * * * . .
 *  . . . * * * . . .
 *  . . . . * . . . .
 *
 ******************************************************************************/
public class No054_Diamond {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        for (int i = -n; i <= n; i++){
            for (int j = -n; j <= n; j++){
                if(Math.abs(i) + Math.abs(j) <= n) System.out.print("* ");
                else                               System.out.print(". ");
            }
            System.out.println();
        }
    }
}
