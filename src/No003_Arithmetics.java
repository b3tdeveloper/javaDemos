import java.util.Scanner;

public class No003_Arithmetics {
    public static void main(String[] args) {
        int number1, number2;

        System.out.println("Enter two numbers : ");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("\n%d + %d = %d",num1,num2,(num1+num2));
        System.out.printf("\n%d - %d = %d",num1,num2,(num1-num2));
        System.out.printf("\n%d x %d = %d",num1,num2,(num1*num2));
        System.out.printf("\n%d : %d = %d",num1,num2,(num1/num2));
        System.out.printf("\n%d mod %d = %d",num1,num2,(num1%num2));
    }
}