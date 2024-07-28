import java.util.TreeMap;

/******************************************************************************
 *  Compilation:  javac Primes.java
 *  Execution:    java Primes n
 *
 *  Determines whether or not n is prime.
 *
 *   % java Prime 81
 *   81 is not prime
 *
 *   % java Prime 17
 *   17 is prime
 *
 *   % java Prime 30864324691489
 *   30864324691489 is not prime
 *
 *
 ******************************************************************************/
public class No031_Prime {
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
        boolean isPrime = true;

        if(n <= 1) isPrime = false;
        else if (n == 2) isPrime = true;
        else {
            for (long i = 2; i*i <= n; i++) {
                if (n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");
    }
}
