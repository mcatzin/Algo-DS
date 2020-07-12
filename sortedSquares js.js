/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

*/
var sortedSquares = function (A) {
    let i = 0;
    let j = A.length - 1;
    let result = [];

    while (i <= j) {
        if (A[i] * A[i] >= A[j] * A[j]) {
            result.unshift(A[i] * A[i])
            i += 1;
        } else {
            result.unshift(A[j] * A[j])
            j -= 1;
        }
    }

    return result;
};