public class Main {
   static boolean anagram(String s,String t) {
      int sArr[] = new int[26];
      int tArr[] = new int[26];
      for (int i = 0; i < s.length(); i++) { // a = 97
         sArr[(int)(Character.toLowerCase(s.charAt(i)) - 97)]++;
      }
      for (int i = 0; i < t.length(); i++) { // a = 97
         tArr[(int)(Character.toLowerCase(t.charAt(i)) - 97)]++;
      }
      for (int i = 0; i < sArr.length; i++) {
         if (sArr[i] != tArr[i])
            return false;
      }
      return true;
   }

   public static void main(String[] args) {

   }
}
