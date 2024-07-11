package LeetCode;

public class ValidStringPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        return isPalindrome(s, 0, s.length() - 1);
    }
    private static boolean isPalindrome(String s, int l, int r){

        while (!Character.isLetterOrDigit(s.charAt(l))) {
            if (l == s.length() - 1) break;
            l++;
        }
        while (!Character.isLetterOrDigit(s.charAt(r))){
            if (r == 0) break;
            r--;
        }


        if ( l >= r) return true;

        if ( Character.toLowerCase((s.charAt(l))) != Character.toLowerCase((s.charAt(r)))) return false;

        return isPalindrome(s, l + 1, r - 1);
    }
}
