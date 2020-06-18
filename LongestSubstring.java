/*
Given a string, find the length of the longest substring in it with no more
than K distinct characters.

Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2'
distinct characters is "araa".
*/

public static int longestSubstringKDistinct(String str, int k){
  if(str == null || str.length() == 0 || str.length() < k)
    throw new IllegalArgumentException();

    int windowStart = 0;
    int maxLength = Integer.MIN_VALUE;

    HashMap<Character, Integer> map = new HashMap<>();

    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char rightChar = str.chatAt(windowEnd);
      map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

      while(map.size() > k){
        char leftChar = str.charAt(windowStart);
        map.put(leftChar, map.get(leftChar) - 1);
        if(map.get(leftChar) == 0){
          map.remove(leftChar);
        }
        windowStart++:
      }
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }

    return maxLength;
}

/*
time: O(N)

space: O(k)  k + 1


*/
