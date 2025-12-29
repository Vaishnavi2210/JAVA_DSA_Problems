import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*  Problem:
         Given an array of integers nums and an integer target,
         return indices of the two numbers such that they add up to target.
      Example:
      Input:  nums = [2, 7, 11, 15], target = 9
      Output: [0, 1]

       Approach:
        Use HashMap to store number → index.
        For each element, check if (target - current number) exists in map.

        Time Complexity: O(n)
        Space Complexity: O(n)
     */

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        // Single Interview Test Case
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" +result[0]+","+result[1]+"]");
        // Expected Output: [0,1]
    }
}
