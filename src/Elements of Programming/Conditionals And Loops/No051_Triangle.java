/******************************************************************************
 *  Compilation:  javac Triangle.java
 *  Execution:    java Triangle n
 *
 *  Prints out an n-by-n triangular pattern like the one below.
 *
 *  % java Triangle
 *  * * * * * *
 *  . * * * * *
 *  . . * * * *
 *  . . . * * *
 *  . . . . * *
 *  . . . . . *
 *
 ******************************************************************************/

public class No051_Triangle {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        for(int i = 0; i < n; i++){
            for (int y = 0; y < n; y++){
                if(y >= i) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println("");
        }

    }
}
