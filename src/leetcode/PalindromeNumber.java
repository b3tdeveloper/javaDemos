package leetcode;

public class PalindromeNumber {
    public static void main(String[] args){
        int number = 101;
        boolean check = isPalindrome(number);
        System.out.println(check);
    }
    public static boolean isPalindrome(int x) {
        int orgNumber = x;
        int revNumber = 0;
        while (orgNumber > 0){
            revNumber = (revNumber*10) + (orgNumber % 10);
            orgNumber = orgNumber / 10;
        }
        if (revNumber == x) return true;
        else return false;
    }
}
