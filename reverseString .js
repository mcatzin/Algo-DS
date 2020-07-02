// Write a function that reverses a string. The input string is given as an array of characters char[].

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// You may assume all the characters consist of printable ascii characters.

var reverseString = function (s) {
    let start = 0;
    let end = s.length - 1;

    while (start <= end) {
        let temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
};