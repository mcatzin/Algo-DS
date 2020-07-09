var nextGreatestLetter = function (letters, target) {
    let left = 0;
    let right = letters.length - 1;

    while (left < right) {
        let mid = Math.floor(left + (right - left) / 2);
        if (letters[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }


    return target >= letters[left] ? letters[0] : letters[left];
};