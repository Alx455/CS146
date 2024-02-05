public class Main {
    static boolean palindrome(String target) {
        if (target.isEmpty())
            return true;
        for (int i = 0; i < target.length()/2 + 1; i++) {
            if (Character.toLowerCase(target.charAt(i)) != Character.toLowerCase(target.charAt(target.length() - 1 - i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
