/******************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *
 *  Generate 2 integers between 1 and 6, and print their sum.
 *
 *  %  java SumOfTwoDice
 *  5
 *
 *  %  java SumOfTwoDice
 *  9
 *
 *  %  java SumOfTwoDice
 *  3
 *
 *  %  java SumOfTwoDice
 *  11
 *
 *  %  java SumOfTwoDice
 *  8
 *
 *  %  java SumOfTwoDice
 *  7
 *
 ******************************************************************************/

public class No011_SumOfTwoDice {
    public static void main(String[] args){
        int dice1 = (int) (Math.random() * 6)+1;
        int dice2 = (int) (Math.random() * 6)+1;
        System.out.println("Dice 1 : " + dice1 + "\nDice 2 : " + dice2 + "\n" + (dice1 + dice2));
    }
}
