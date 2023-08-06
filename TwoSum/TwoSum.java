package TwoSum;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapInteger = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (mapInteger.containsKey(temp)) {
                return new int[] {mapInteger.get(temp), i};
            }

            mapInteger.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);

        for (int index: result) {
            System.out.print(index + " ");
        }
    }
}
