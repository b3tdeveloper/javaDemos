/*
* Number-to-English.
* Write a program to read in a command line integer between
* -999,999,999 and 999,999,999 and print the English equivalent.
* Here is an exhaustive list of words
* that your program should use: negative, zero, one, two,
* three, four, five, six, seven, eight, nine, ten, eleven,
* twelve, thirteen, fourteen, fifteen, sixteen, seventeen,
* eighteen, nineteen, twenty, thirty, forty, fifty, sixty,
* seventy, eighty, ninety, hundred, thousand, million .
* Don't use hundred, when you can use thousand, e.g.,
* use one thousand five hundred instead of fifteen hundred.
* */
public class No043_NumberToEnglish {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        if (number < 0) {
            System.out.print("Negative ");
            number = -number;
        }

        int part1 = number / 1000000;
        int part2 = (number % 1000000) / 1000;
        int part3 = number % 1000;

        if (part1 > 0) {
            printNumberInWords(part1);
            System.out.print(" Million ");
        }

        if (part2 > 0) {
            printNumberInWords(part2);
            System.out.print(" Thousand ");
        }

        if (part3 > 0) {
            printNumberInWords(part3);
        }
    }

    public static void printNumberInWords(int number) {
        if (number >= 100) {
            int hundreds = number / 100;
            System.out.print(digitToWord(hundreds) + " Hundred ");
            number %= 100;
        }

        if (number >= 20) {
            int tens = number / 10;
            System.out.print(tensToWord(tens) + " ");
            number %= 10;
        }

        if (number > 0) {
            System.out.print(digitToWord(number) + " ");
        }
    }

    public static String digitToWord(int digit) {
        if (digit == 1) return "One";
        if (digit == 2) return "Two";
        if (digit == 3) return "Three";
        if (digit == 4) return "Four";
        if (digit == 5) return "Five";
        if (digit == 6) return "Six";
        if (digit == 7) return "Seven";
        if (digit == 8) return "Eight";
        if (digit == 9) return "Nine";
        if (digit == 10) return "Ten";
        if (digit == 11) return "Eleven";
        if (digit == 12) return "Twelve";
        if (digit == 13) return "Thirteen";
        if (digit == 14) return "Fourteen";
        if (digit == 15) return "Fifteen";
        if (digit == 16) return "Sixteen";
        if (digit == 17) return "Seventeen";
        if (digit == 18) return "Eighteen";
        if (digit == 19) return "Nineteen";
        return "";
    }

    public static String tensToWord(int tens) {
        if (tens == 2) return "Twenty";
        if (tens == 3) return "Thirty";
        if (tens == 4) return "Forty";
        if (tens == 5) return "Fifty";
        if (tens == 6) return "Sixty";
        if (tens == 7) return "Seventy";
        if (tens == 8) return "Eighty";
        if (tens == 9) return "Ninety";
        return "";
    }
}

