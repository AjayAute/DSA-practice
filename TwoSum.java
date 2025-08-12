/*
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Date: 2025-08-12
Link: https://leetcode.com/problems/two-sum/
*/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];
            if (hm.containsKey(req_num)) {
                return new int[]{hm.get(req_num), i};
            }
            hm.put(nums[i], i);
        }
        return null; // No solution found
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
