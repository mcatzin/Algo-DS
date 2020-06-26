/*
Given an array of integers, return indices of the two numbers such that they add up 
to a specific target.

You may assume that each input would have exactly one solution, and you may not use the 
same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

public class twoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                result[0] = map.get(target - num);
                result[1] = i;
                return result;
            } else {
                map.put(num, i);
            }
        }

        return result;
    }
}