package kodlab.stringClass;

public class PalindromeMetin {

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text1 = "Kazak";
        System.out.println(text1 + " is palindrome? " + isPalindrome(text1));

        String text2 = "Java";
        System.out.println(text2 + " is palindrome? " + isPalindrome(text2));
    }
}
