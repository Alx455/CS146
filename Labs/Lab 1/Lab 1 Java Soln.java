import java.util.HashMap;

public class Main {
static int[] twoSum(int[] arr, int target) {
    int[] answer = {0, 0};
    HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
    for (int i = 0; i < arr.length; i++) {
        sums.put(arr[i], i);
    }
    for (int j = 0; j < arr.length; j++) {
        if (sums.containsKey(target - arr[j]) && (sums.get(target - arr[j]) != j )) {
            answer[0] = sums.get(target - arr[j]);
            answer[1] = j;
        }
    }
    return answer;
}

    public static void main(String[] args) {
        //int[] arr = {5, 2, 3};    target = 8, output = [0, 2]
        //int[] arr = {3, 2, 4};    target = 6, output = [1, 2]
        int[] arr = {5, 3, 4, 5, 2};    // target = 10, output = [3, 0]
        int[] ans = twoSum(arr, 10);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
