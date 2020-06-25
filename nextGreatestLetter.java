/*
Given a list of sorted characters letters containing only lowercase letters, 
and given a target letter target, find the smallest element in the list that is 
larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' 
and letters = ['a', 'b'], the answer is 'a'.

Input:
letters = ["c", "f", "j"]
target = "a"
Output: "c

*/

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        if (target >= letters[n - 1])
            return letters[0];

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[right];
    }
}