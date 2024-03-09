package kodlab.algorythm;

public class UsernameValidation {
    public static boolean codeLandUsernameValidation(String str) {
        if (str.length() < 4 || str.length() > 25) {
            return false;
        }

        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }

        if (!str.matches("[a-zA-Z0-9_]+")) {
            return false;
        }

        if (str.endsWith("_")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String testUsername = "my_username";
        System.out.println(codeLandUsernameValidation(testUsername));
    }
}
