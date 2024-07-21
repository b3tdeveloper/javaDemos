/******************************************************************************
 *  Compilation:  javac RollLoadedDie.java
 *  Execution:    java RollLoadedDie
 *
 *  Simulate the roll of a loaded six-sided die, where the values
 *  1, 2, 3, 4, and 5 appear with probability 1/8 and the value 6
 *  appears with probablity 3/8, and print the resulting number.
 *
 *  % java RollLoadedDie
 *  4
 *
 *  % java RollLoadedDie
 *  6
 *
 ******************************************************************************/
public class No033_RollLoadedDie {
    public static void main(String[] args){
        double random = Math.random();

        if      (random < 1.0 / 8) System.out.println(1);
        else if (random < 2.0 / 8) System.out.println(2);
        else if (random < 3.0 / 8) System.out.println(3);
        else if (random < 4.0 / 8) System.out.println(4);
        else if (random < 5.0 / 8) System.out.println(5);
        else                       System.out.println(6);

        System.out.println(random);
    }
}
