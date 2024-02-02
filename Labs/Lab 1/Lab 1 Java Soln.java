import java.util.HashMap;

public class Main {
    static int[] twoSum(int[] nums, int target) {
        int[] answer = {0, 0};
        HashMap<Integer, Integer> indicies = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            indicies.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (indicies.containsKey(target - nums[j]) && (indicies.get(target - nums[j]) != j )) {
                answer[0] = indicies.get(target - nums[j]);
                answer[1] = j;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        //int[] arr = {5, 2, 3};
        //int[] arr = {3, 2, 4};
        int[] arr = {5, 3, 4, 5, 2};
        int[] ans = twoSum(arr, 10);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
