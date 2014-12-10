package nawns.competition;

/**
 * "A man, a plan, a canal: Panama" is a palindrome, while "race a car" is not a palindrome.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s1) {
        s1 = s1.toLowerCase().replaceAll("[\\ -\\@]","");
        System.out.println(s1);
        String s2 = new StringBuilder(s1).reverse().toString();
        return (s1.equals(s2));
    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(ValidPalindrome.isPalindrome(a));

        String b = "race a car";
        System.out.println(ValidPalindrome.isPalindrome(b));
    }
}

