// You are given an array A of strings.

// A move onto S consists of swapping any two even indexed characters of S, or any two odd indexed characters of S.

// Two strings S and T are special-equivalent if after any number of moves onto S, S == T.

// For example, S = "zzxy" and T = "xyzz" are special-equivalent because we may make the moves "zzxy" -> "xzzy" -> "xyzz" that swap S[0] and S[2], then S[1] and S[3].

// Now, a group of special-equivalent strings from A is a non-empty subset of A such that:

// Every pair of strings in the group are special equivalent, and;
// The group is the largest size possible (ie., there isn't a string S not in the group such that S is special equivalent to every string in the group)
// Return the number of groups of special-equivalent strings from A.


// Example 1:

// Input: ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
// Output: 3
// Explanation: 
// One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings are all pairwise special equivalent to these.

// The other two groups are ["xyzz", "zzxy"] and ["zzyx"].  Note that in particular, "zzxy" is not special equivalent to "zzyx"

var numSpecialEquivGroups = function (A) {
    let s = new Set();
    for (let w of A) {
        let temp = helper(w);
        s.add(temp);
    }

    return s.size;
};


const helper = function (s) {
    if (s.length <= 1)
        return s

    let first = '',
        sec = ''
    for (let i = 0; i < s.length; i += 2) {
        first += s[i];
    }
    first = first.split('').sort().join('');

    for (let i = 0; i < s.length; i += 1) {
        sec += s[i]
    }
    sec = sec.split('').sort().join('')

    return first + sec;
}