/*
* Write a code fragment that reverses
* the order of values in a one-dimensional string array.
* Do not create another array to hold the result.
* Hint: Use the code in the text for exchanging two elements.
* */
public class No062_Reverse {
    public static void main(String[] args){
        int[] numbers = new int[10];

        //Random Numbers in Array
        for (int i = 0; i < 10; i++){
            numbers[i] = (int) (Math.random() * 10);
            System.out.print(numbers[i] + " ");
        }

        //Reverse
        for (int i = 0; i < 5; i ++){
            int temp = numbers[i];
            numbers[i] = numbers[9-i];
            numbers[9-i] = temp;
        }

        //Output
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
