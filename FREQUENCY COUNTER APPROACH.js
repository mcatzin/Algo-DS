// Create string variable
str = "madam"
// Create empty object 
let letterCount = {}
// Loop through every letter in the string
for (let i = 0; i < str.length; i++) {
    // If the letter is a key inside the object
    if (letterCount[str[i]]) {
        // Add 1 to the counter
        letterCount[str[i]] += 1
    } else {
        // Otherwise, create a new counter for that new letter
        letterCount[str[i]] = 1
    }
}

// Print in the console
console.log(letterCount)