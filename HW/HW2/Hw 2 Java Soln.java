
public class Main {
    static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
	      int mid;
        int prev = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                prev = mid;
		            right = mid - 1;
            } else if (!isBadVersion(mid)) {
                left = mid + 1;
            }
        }
	      return prev;
    }

     public static void main(String[] args) {

     }
}
