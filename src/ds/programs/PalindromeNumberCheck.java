package ds.programs;

public class PalindromeNumberCheck {

    public static boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int revNum = 0;
        while(num >0){
            revNum = revNum * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println("revnum "+revNum);
        return revNum == num;
    }

    public static void main(String[] args) {
        int input = 1200;
        System.out.println(isPalindrome(input)); // Output: true
    }
}
