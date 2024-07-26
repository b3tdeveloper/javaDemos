/******************************************************************************
 *  Compilation:  javac ThueMorse.java
 *  Execution:    java ThueMorse n
 *
 *  Prints the Thue-Morse sequence, which is defined as follows
 *
 *      Start with 0, and repeatedly flip all the bits and concatenate
 *      it onto the original string.
 *
 *  % java ThueMorse 0
 *  0
 *
 *  % java ThueMorse 1
 *  01
 *
 *  % java ThueMorse 2
 *  0110
 *
 *  % java ThueMorse 3
 *  01101001
 *
 *  % java ThueMorse 4
 *  0110100110010110
 *
 *  % java ThueMorse 5
 *  01101001100101101001011001101001
 *
 ******************************************************************************/


public class No047_ThueMorse {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String thue = "0";
        String morse = "1";
        String thue1 = "";

        for(int i = 0; i <= n; i++) {
            thue1 = thue;
            thue = thue + morse;
            morse = morse + thue1;
        }
        System.out.println(thue);
    }
}
