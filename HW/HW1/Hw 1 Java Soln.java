public class Main {
    static boolean palindrome(String s) {
        if (s.isEmpty())
            return true;
        for (int i = 0; i < s.length()/2 + 1; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length() - 1 - i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
