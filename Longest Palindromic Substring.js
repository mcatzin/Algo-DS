/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

*/

var longestPalindrome = function (s) {
    if (s.length <= 1) return s;


    const dp = [...new Array(s.length + 1)].map(_ => new Array(s.length + 1).fill(false));

    let lps = '';

    for (let i = 0; i < s.length; i++) {
        dp[i][i] = true;
        lps = s[i];
    }


    for (let i = 0; i < s.length; i++) {
        if (s[i] === s[i + 1]) dp[i][i + 1] = true;
        if (dp[i][i + 1]) lps = s.substring(i, i + 2);
    }

    for (let i = s.length - 1; i >= 0; i--) {
        for (let j = i + 2; j < s.length; j++) {
            dp[i][j] = dp[i + 1][j - 1] && s[i] === s[j];
            if (dp[i][j]) lps = lps.length < (j - i + 1) ? s.substring(i, j + 1) : lps;
        }
    }

    return lps;
};