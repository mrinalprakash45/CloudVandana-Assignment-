const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWords(sentence) {
    const words = sentence.split(/\s/); // Split sentence into words
    let reversedSentence = '';

    for (const word of words) {
        const reversedWord = reverseString(word);
        reversedSentence += reversedWord + ' ';
    }

    return reversedSentence.trim();
}

function reverseString(str) {
    const charArray = str.split('');
    let start = 0;
    let end = str.length - 1;

    while (start < end) {
        // Swap characters at start and end
        const temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;

        start++;
        end--;
    }

    return charArray.join('');
}

rl.question('Enter a sentence: ', function(sentence) {
    // Reverse every word in the sentence
    const reversedSentence = reverseWords(sentence);

    // Display the result
    console.log('Reversed Sentence:', reversedSentence);

    rl.close();
});
