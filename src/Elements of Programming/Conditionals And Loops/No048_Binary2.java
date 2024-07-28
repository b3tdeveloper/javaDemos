/*
* Program Binary.java prints the binary
* representation of a decimal number n by casting
*  out powers of 2. Write an alternate version Program
*  Binary2.java that is based on the following method: Write 1
*  if n is odd, 0 if n is even. Divide n by 2, throwing away the
*  remainder. Repeat until n = 0 and read the answer
*  backwards. Use % to determine whether n is even, and use
*  string concatenation to form the answer in reverse order.
* */
public class No048_Binary2 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String binary = "";
        if(n == 0) binary = "0";
        while (n > 0){
            if(n % 2 == 1) binary = "1" + binary;
            else binary = "0" + binary;
            n /= 2;
        }
        System.out.println(binary);
    }
}
