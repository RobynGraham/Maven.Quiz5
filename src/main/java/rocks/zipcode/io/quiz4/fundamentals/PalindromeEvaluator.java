package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {









        return null;
    }

    public static Boolean isPalindrome(String string) {

        String reverse = new String();

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }

        if (string.equals(reverse)) {
            return true;
        }

        if (!string.equals(reverse)) {

            return false;
        }
        return null;
    }


    public static String reverseString(String string) {

        String reverse = "";

        for (int i = string.length()-1; i >=0; i--) {
             reverse = reverse + string.charAt(i);

        }

        return reverse;
    }
}
