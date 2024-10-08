/******************************************************************************
 *  Compilation:  javac ISBN.java
 *  Execution:    java ISBN n
 *
 *  Determines the check digit of an ISBN-10 number given the first 9 digits.
 *
 *  An ISBN-10 number is valid if it consists of 10 digits and
 *  d_1 + 2*d_2 + 3*d_3 + ... + 10*d_10 is a multiple of 11.
 *  For example, 0-201-31452-5 is valid since
 *  1*5 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 = 88
 *  and 88 is a multiple of 11.
 *
 *  % java ISBN 013407642
 *  The full ISBN number is 0134076427
 *
 *  % java ISBN 067233784
 *  The full ISBN number is 0672337843
 *
 *  % java ISBN 032157351
 *  The full ISBN number is 032157351X
 *
 ******************************************************************************/

public class No037_ISBN {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 2; i < 11; i++){
            int lastDigit = n % 10;
            sum = sum + lastDigit * i;
            n = n / 10;
        }

        System.out.print("The full ISBN number is " + args[0]);
        if      (sum % 11 == 1) System.out.println("X");
        else if (sum % 11 == 0) System.out.println("0");
        else                    System.out.println(11 - (sum % 11));
    }
}
