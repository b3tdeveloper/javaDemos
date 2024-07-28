/*
* Seasons. Write a program Season.java that
* takes two command line integers M and D and
* prints the season corresponding to month
* M (1 = January, 12 = December) and day
* D in the northern hemisphere. Use the following table
*
*
SEASON	    FROM	        TO
Spring	    March 21	    June 20
Summer	    June 21	        September 22
Fall	    September 23	December 21
Winter	    December 21	    March 20
* */
public class No056_Season {
    public static void main(String[] args){
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);

        if      ((M == 3 && D >= 21) || (M == 4 || M == 5)   || (M == 6 && D <= 20))  System.out.println("Spring");
        else if ((M == 6)            || (M == 7 || M == 8)   || (M == 9 && D <= 22))  System.out.println("Summer");
        else if ((M == 9)            || (M == 10 || M == 11) || (M == 12 && D <= 21)) System.out.println("Fall");
        else if ((M == 12)           || (M == 1 || M == 2)   || (M == 3))             System.out.println("Winter");
        else                                                                          System.out.println("İnvalid");
    }
}
