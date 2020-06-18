/*
Given an array of positive numbers and a positive number ‘S’,
find the length of the smallest contiguous subarray whose
sum is greater than or equal to ‘S’.
Return 0, if no such subarray exists.

Input: [2, 1, 5, 2, 3, 2], S=7
Output: 2
Explanation: The smallest subarray
with a sum great than or equal to '7' is [5, 2].

*/

public static int findMinSubarry(int[] arr, int S){
  int windowSum = 0;
  int minLength = Integer.MAX_VALUE;
  int windowStart = 0;

  for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
    windowSum += arr[windowEnd];

    while(windowSum >= S){
      minLength = Math.min(min, windowEnd - windowStart + 1);
      windowSum += arr[windowStart];
      windowStart++;
    }
  }

  return Integer.MAX_VALUE == minLength ? 0 : minLength;

}

/*
time: O(n)

space O(1)

*/
