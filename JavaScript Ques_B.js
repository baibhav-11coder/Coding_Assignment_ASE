// Ask the user for input
const input = prompt("Enter a list of numbers separated by spaces:");

// Split the input string into an array of numbers
const numbers = input.split(' ').map(Number);

// Check if the input is valid
if (input.trim() !== "" && !numbers.includes(NaN)) {
    // Sort the array in descending order
    numbers.sort(function(a, b) {
        return b - a;
    });

    console.log("Sorted array in descending order: " + numbers);
} else {
    console.log("Invalid input. Please enter a list of numbers separated by spaces.");
}