import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class No002_EnterTwoNumber {
    public static void main(String[] args){

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Please enter a number : ");
            int num1 = myObj.nextInt();
            System.out.print("Please enter a number : ");
            int num2 = myObj.nextInt();
            System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2 + "\nTotal : " + (num2 + num1));
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers, this input does not match the Integer regular expression, or is out of range");
        } catch (NoSuchElementException e) {
            System.out.println("Input is exhausted");
        } catch (IllegalStateException e) {
            System.out.println("This scanner is closed");
        }


    }
}
