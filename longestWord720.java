/*
Given a list of strings words representing an English Dictionary, 
find the longest word in words that can be built one character at a 
time by other words in words. If there is more than one possible answer, 
return the longest word with the smallest lexicographical order.

If there is no answer, return the empty string.
Example 1:
Input: 
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation: 
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

*/
public class longestWord720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";
        for (String w : words) {
            if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
                result = w.length() > result.length() ? w : result;
                set.add(w);
            }
        }
        return result;
    }
}