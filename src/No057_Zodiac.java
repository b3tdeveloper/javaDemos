/*
* Zodiac signs. Write a program Zodiac.java
* that takes two command line integers M and D
* and prints the Zodiac sign corresponding to month
* M (1 = January, 12 = December) and day D.
* Use the following table
 * */public class No057_Zodiac {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        String zodiac = "";

        if ((month == 1 && day >= 20) || (month == 2 && day <= 17)) {
            zodiac = "Aquarius";
        } else if ((month == 2) || (month == 3 && day <= 19)) {
            zodiac = "Pisces";
        } else if ((month == 3) || (month == 4 && day <= 19)) {
            zodiac = "Aries";
        } else if ((month == 4) || (month == 5 && day <= 20)) {
            zodiac = "Taurus";
        } else if ((month == 5) || (month == 6 && day <= 20)) {
            zodiac = "Gemini";
        } else if ((month == 6) || (month == 7 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7) || (month == 8 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8) || (month == 9 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9) || (month == 10 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10) || (month == 11 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11) || (month == 12 && day <= 21)) {
            zodiac = "Sagittarius";
        } else if ((month == 12) || (month == 1)) {
            zodiac = "Capricorn";
        } else {
            System.out.println("Invalid date");
            return;
        }

        System.out.println(zodiac);
    }
}