/*
* (hard) Now, try to compute the median of 5 elements
* such that when executed, it never makes
* more than 6 total comparisons.
* */
public class No040_Median {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);

        int max = 0;
        int second = 0;
        int median = 0;

        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            max = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            max = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            max = num3;
        } else if (num4 > num1 && num4 > num3 && num4 > num2 && num4 > num5) {
            max = num4;
        }else {
            max = num5;
        }
        boolean isFound = false;
        for (int i = max-1; i >= 0; i--){
            if ((i == num1 || i == num2 || i == num3 || i == num4 || i == num5)){
                if (!isFound){
                    isFound = true;
                    second = i;
                }else {
                    median = i;
                    break;
                }
            }
        }

        System.out.println(max);
        System.out.println(second);
        System.out.println(median);

    }
}
