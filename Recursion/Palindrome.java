package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s="123321";
        System.out.println(palindrome(s,0,s.length()-1));
    }
    static boolean palindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
            return palindrome(s, left + 1, right - 1);
        } else {
            return false;
        }
    }
}
