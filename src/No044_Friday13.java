/*
* Friday the 13th.
What is the maximum number of consecutive
days in which no Friday the 13th occurs?
Hint: The Gregorian calendar repeats
itself every 400 years (146097 days) so
you only need to worry about a 400 year interval.
 */
public class No044_Friday13 {
    public static void main(String[] args){
        int firstYear = 1800;
        int lastYear = 2024;
        int firstMonth = 1;
        int lasthMonth = 12;

        int y = firstYear;
        int m = firstMonth;
        int d = 1;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        for(int year = firstYear; year <= lastYear; year++){
            boolean isLeap = false;
            if(year % 4 == 0){
                isLeap = true;
                if(year % 100 == 0 && year % 400 == 0){
                    isLeap = true;
                }else if(year % 100 == 0 && year % 400 != 0) isLeap = false;
            }
            // I can  use "boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));" code instead of this

            for(int month = firstMonth; month <= lasthMonth; month ++){
                for(int day = 1; day <= 31; day++){
                    //Days
                    if(isLeap && month == 2 && day == 30){
                        break;
                    }else if(!isLeap && month == 2 && day == 29){
                        break;
                    }else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31){
                        break;
                    }

                    //DaysOfWeek

                    d0 ++;
                    if(d0 == 7) d0 = 0;
                    if(d0 == 6 && day == 13){
                        System.out.println(month + "/" + day + "/" + year);
                    }

                }
            }
        }
    }
}

