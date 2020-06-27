/*
Given an array nums containing n + 1 
integers where each integer is between 1 and n (inclusive), prove that at least one 
duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2

*/

public class findDuplicate287 {
    public int findDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}