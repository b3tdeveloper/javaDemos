/*
* Optimal oblivious sorting networks.
* Create a program that sorts four integers
* using only 5 if statements, and one
* that sorts five integers using
* only 9 if statements of the type above?
* Oblivious sorting networks are useful for
* implementing sorting algorithms in hardware.
* How can you check that your program works for all inputs?
Solution: Sort4.java sorts 4 elements
* using 5 compare-exchanges. Sort5.java
* sorts 5 elements using 9 compare-exchanges.
*
* */
public class No058_Sort4 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int t = 0;
        if(a > b) { t = a; a = b; b = t;}
        //System.out.println("1 " +  a + "  " + b + "  " + c + "  " + d);

        if(c > d) { t = c; c = d; d = t;}
        //System.out.println("2 " + a + "  " + b + "  " + c + "  " + d);

        if(b > d) { t = b; b = d; d = t;}
        //System.out.println("3 " + a + "  " + b + "  " + c + "  " + d);

        if(a > c) { t = a; a = c; c = t;}
        //System.out.println("4 " + a + "  " + b + "  " + c + "  " + d);

        if(b > c) { t = b; b = c; c = t;}
        System.out.println(/*"5 " + */a + " <= " + b + " <= " + c + " <= " + d);
    }
}
