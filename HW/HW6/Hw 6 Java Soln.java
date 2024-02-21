import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k] == 0)) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[j]);
                        triplet.add(nums[i]);
                        triplet.add(nums[k]);
                        if (!triplets.contains(triplet))
                            triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        
    }
}
