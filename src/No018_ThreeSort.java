/******************************************************************************
 *  Compilation:  javac ThreeSort.java
 *  Execution:    java ThreeSort a b c
 *
 *  Read 3 integer values from the command line and print them
 *  in ascending order.
 *
 *  % java ThreeSort 17 50 33
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 50 33 17
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 17 50 17
 *  17
 *  17
 *  50
 *
 ******************************************************************************/

public class No018_ThreeSort {
    public static void main(String[] args){
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(i1, i2), i3);
        int min = Math.min(Math.min(i1, i2), i3);
        int med = i1 + i2 + i3 - max - min;

        System.out.println(min);
        System.out.println(med);
        System.out.println(max);


    }
}
