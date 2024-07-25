/*
* Write the shortest Java program you can
* that takes an integer command-line argument n and prints true
* if (1 + 2 + ... + n) 2 is equal to (13 + 23 + ... + n3).
Solution: Always print true.
* */
public class No045_SquareCube {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int cubeSum = 0;
        for (int i = 1; i <= n; i ++){
            sum = sum + i;
            System.out.println("Sum^2 : " + sum*sum);
            cubeSum = cubeSum + (i*i*i);
            System.out.println("Cube sum : " + cubeSum);
        }
        int squareSum = sum*sum;

        if(squareSum == cubeSum) System.out.println(true);
        else System.out.println(false);



    }
}
