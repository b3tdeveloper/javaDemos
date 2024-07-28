/******************************************************************************
 *  Compilation:  javac Stats5.java
 *  Execution:    java Stats5
 *
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  % java Stats5
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java Stats5
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 ******************************************************************************/
public class No017_Stats5 {
    public static void main(String[] args){
        double r1 = Math.random();
        double r2 = Math.random();
        double r3 = Math.random();
        double r4 = Math.random();
        double r5 = Math.random();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        double average = (r1+r2+r3+r4+r5)/5;
        double min = Math.min(Math.min(Math.min(r1,r2),Math.min(r3,r4)),r5);
        double max = Math.max(Math.max(Math.max(r1,r2),Math.max(r3,r4)),r5);

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}
