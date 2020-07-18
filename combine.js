/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

Example:

Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]

*/

var combine = function (n, k) {
    let sets = combo(k, n);

    return sets;
};

function combo(max, n, sets = [], current = [], index = 1) {
    if (current.length === max) {
        sets.push(current);
        return [];
    } else {
        while (index <= n) {
            combo(max, n, sets, [...current, index], ++index);
        }

        return sets;
    }
}