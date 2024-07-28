/******************************************************************************
 *  Compilation:  javac FivePerLine.java
 *  Execution:    java FivePerLine
 *
 *  Print the integers from 1000 to 2000, 5 per line.
 *
 *  % java FivePerLine
 *
 ******************************************************************************/

public class No034_FivePerLine {
    public static void main(String[] args){
        int start = 1000;
        int end = 2000;

        int counter = 0;
        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
            counter ++;
            if (counter == 5){
                counter = 0;
                System.out.println("");
            }
        }
    }
}
