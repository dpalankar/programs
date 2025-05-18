package ds.programs;

public class TwoPointerPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
//        String input = "CAPPAC";
        String input = "jhjhvhnhf";
        System.out.println(isPalindrome(input)); // Output: true
    }
}
