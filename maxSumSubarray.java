*/
Given an array of positive numbers and a positive number ‘k’, find the maximum
sum of any contiguous subarray of size ‘k’.


Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].

*/

public static int findMaxSubarray(int[] arr, int k){
  int max = Integer.MIN_VALUE;
  int windowStart = 0;
  int windowSum = 0;

  for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
    windowSum += arr[windowEnd];

    if(windowEnd >= k - 1){
      max = Math.max(max, windowSum);
      windowSum -= arr[windowStart];
      windowStart++;
    }
  }

  return max;
}


/*
Time: O(n)

space: o(1)


*/
