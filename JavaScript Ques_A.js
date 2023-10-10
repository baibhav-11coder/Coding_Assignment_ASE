function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the final sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Ask the user for input
const inputSentence = prompt("Enter a sentence:");

if (inputSentence !== null && inputSentence !== "") {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log("Reversed sentence: " + reversedSentence);
} else {
    console.log("Invalid input. Please enter a sentence.");
}