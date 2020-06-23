/*
Given a string S, we can transform every letter individually to 
be lowercase or uppercase to create another string.  
Return a list of all possible strings we could create.
Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]


*/

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        compute(result, S.toCharArray(), 0);
        return result;
    }
    
    public void compute(List<String> result, char[] chars, int index){
        if(index == chars.length){
            result.add(new String(chars));
        }else{
            if(Character.isLetter(chars[index])){
                chars[index] = Character.toLowerCase(chars[index]);
                compute(result, chars, index + 1);
                chars[index] = Character.toUpperCase(chars[index]);
            }
            compute(result, chars, index + 1);
        }
    }
}