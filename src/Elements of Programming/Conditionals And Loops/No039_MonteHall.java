/******************************************************************************
 *  Compilation:  javac MonteHall.java
 *  Execution:    java MonteHall trials
 *
 *  Plays the Monte Hall game the specified number of times with the
 *  switching strategy and reports the fraction of games won.
 *
 *  Sample execution:
 *
 * % java MonteHall 10000000
 * Fraction of games won = 0.666586
 *
 *
 *  Note:  true winning probability = 2/3.
 *
 ******************************************************************************/

public class No039_MonteHall {
    public static void main(String[] args){
        int trials = Integer.parseInt(args[0]);

        int win = 0;

        for (int i = 0; i < trials; i ++){
            int prize = (int) (3* Math.random());
            int choice = (int) (3*Math.random());

            int reveal;
            do {
                reveal = (int) (3 * Math.random());
            } while ((reveal == choice) || (reveal == prize));


            int other = 0 + 1 + 2 - reveal - choice;

            if(choice == prize) win++;
        }
        System.out.println(1.0 * win / trials);
    }
}
