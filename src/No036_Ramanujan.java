/******************************************************************************
 *  Compilation:  javac Ramanujan.java
 *  Execution:    java Ramanujan n
 *
 *  Prints out any number between 1 and n that can be expressed as the
 *  sum of two cubes in two (or more) different ways.
 *
 *  % java Ramanujan 1728
 *
 *  % java Ramanujan 1729
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *
 *  % java Ramanujan 10000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *
 *  % java Ramanujan 100000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *  13832 = 2^3 + 24^3 = 18^3 + 20^3
 *  39312 = 2^3 + 34^3 = 15^3 + 33^3
 *  46683 = 3^3 + 36^3 = 27^3 + 30^3
 *  32832 = 4^3 + 32^3 = 18^3 + 30^3
 *  40033 = 9^3 + 34^3 = 16^3 + 33^3
 *  20683 = 10^3 + 27^3 = 19^3 + 24^3
 *  65728 = 12^3 + 40^3 = 31^3 + 33^3
 *  64232 = 17^3 + 39^3 = 26^3 + 36^3
 *
 *  % java Ramanujan 100000000 | sort -n   // sort results numerically in Unix
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  ...
 *  87539319 = 167^3 + 436^3 = 228^3 + 423^3
 *  87539319 = 167^3 + 436^3 = 255^3 + 414^3
 *  87539319 = 228^3 + 423^3 = 255^3 + 414^3
 *  ...
 *
 *  Bugs
 *  ----
 *  If a number can be expressed as a sum of cubes in more than two
 *  different ways, the program prints some duplicates.
 *
 ******************************************************************************/

public class No036_Ramanujan {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        int number1 = 0;
        int number2 = 0;

        for (int i = 1; i <= n; i++){
            if(i*i*i > n) break;

            for(int j = i; j <= n; j++){
                number1 = i*i*i + j*j*j;
                if(j*j*j > n) break;

                for (int k = i+1; k <= n; k++){
                    if(k*k*k > n) break;

                    for(int m = k; m <= n; m++){
                        if(m*m*m > n) break;

                        number2 = k*k*k + m*m*m;
                        if(i != k && i != m && j != k && j != m && number1 == number2){
                            System.out.printf("%d = %d^3 + %d^3 = %d^3 + %d^3\n",number1,i,j,k,m);
                        }
                    }
                }
            }
        }

    }
}
