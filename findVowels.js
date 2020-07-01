// write a function that returns the number of vowels 
// used in a string. vowels are the characters 'a','e'','i','o',and 'u'
// 

function vowels(str) {
    let count = 0;

    const check = ['a', 'e', 'i', 'o', 'u']
    for (let char of str.tolowerCase()) {
        if (check.includes(char)) {
            count++
        }
    }

    return count;
}