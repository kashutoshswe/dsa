package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if(str.isEmpty() || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }
}