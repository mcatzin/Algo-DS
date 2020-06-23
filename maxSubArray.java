/*
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum and return its sum.

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maxValue = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        for(int i = 1; i < nums.length;i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            maxValue = Math.max(maxValue, dp[i]);
        }
        
        return maxValue;
    }
}