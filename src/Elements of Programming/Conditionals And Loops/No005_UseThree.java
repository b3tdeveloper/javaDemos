/******************************************************************************
 *  Compilation:  javac UseThree.java
 *  Execution:    java UseThree name1 name2 name3
 *
 *  Takes 3 command-line arguments and prints them in reverse order
 *  in a friendly greeting.
 *
 *  % java UseThree Alice Bob Carol
 *  Hi, Carol, Bob, and Alice.
 *
 *  % java UseThree Carol Bob Alice
 *  Hi, Alice, Bob, and Carol.
 *
 ******************************************************************************/

public class No005_UseThree {
    public static void main(String[] args){
        System.out.print("Hi, " + args[2] + ", " + args[1] + ", " + args[0] + ".");
    }
}

//Source : https://introcs.cs.princeton.edu/java/11hello/UseThree.java.html