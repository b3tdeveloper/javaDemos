/*
*
* Suppose a, b, and c are random number uniformly
* distributed between 0 and 1. What is the probability
*  that a, b, and c form the side length of some triangle?
*  Hint: they will form a triangle if and only if
* the sum of every two values is larger than the third.
*
* My answer as a code, around 0.5
*
* Other question : triangle is obtuse
* around 0.214
*
* */
public class No050_TriangleProbability {
    public static void main(String[] args){
        int test = Integer.parseInt(args[0]);
        int triangleCount = 0;

        for (int i = 0; i < test; i++) {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();

            // if (a + b > c && a + c > b && b + c > a) triangleCount++; //this is for normal triangle

            //Repeat the previous question, but calculate the probability that the resulting triangle is obtuse
            if (a + b > c && a + c > b && b + c > a && a*a + b*b > c*c && a*a + c*c > b*b && b*b + c*c > a*a) triangleCount++;
        }
        double probability = (double) triangleCount / (test);
        System.out.println(probability + " = " + triangleCount + "/" + (test));

    }
}
