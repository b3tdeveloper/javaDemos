/******************************************************************************
 *  Compilation:  javac Ex.java
 *  Execution:    java Ex n
 *
 *  Prints out an X of radius n like the one below.
 *
 *  % java Ex 3
 *  * . . . . . *
 *  . * . . . * .
 *  . . * . * . .
 *  . . . * . . .
 *  . . * . * . .
 *  . * . . . * .
 *  * . . . . . *
 *
 *  % java Ex 5
 *  * . . . . . . . . . *
 *  . * . . . . . . . * .
 *  . . * . . . . . * . .
 *  . . . * . . . * . . .
 *  . . . . * . * . . . .
 *  . . . . . * . . . . .
 *  . . . . * . * . . . .
 *  . . . * . . . * . . .
 *  . . * . . . . . * . .
 *  . * . . . . . . . * .
 *  * . . . . . . . . . *
 *
 ******************************************************************************/
public class No052_Ex {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        n = n*2+1;
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                if (i == j || j == n-1 - i) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println("");
        }
    }
}
