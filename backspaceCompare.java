/*
Given two strings S and T, return if they are equal when both are typed 
into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

*/

public class backspaceCompare844 {
    public boolean backspaceCompare(String S, String T) {
        return compute(S).equals(compute(T));
    }

    private Stack<Character> compute(String S) {
        Stack<Character> stack = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack;
    }

}