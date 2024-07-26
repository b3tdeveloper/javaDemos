/*
* Write a program NPerLine.java that takes
* an integer command-line argument n and prints
* the integers from 10 to 99 with n integers per line.
 * */
public class No049_NPerLine {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            if (counter == n) {
                System.out.println("");
                counter = 0;
            }
            if(i < 10) System.out.print(i + "   ");
            else if(i < 100) System.out.print(i + "  ");
            else System.out.print(i + " ");

            counter++;
        }
    }
}
