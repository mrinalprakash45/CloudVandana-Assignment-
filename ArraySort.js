const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function bubbleSortDescending(arr) {
    var n = arr.length;

    for (var i = 0; i < n - 1; i++) {
        for (var j = 0; j < n - i - 1; j++) {
            // Swap if the element found is greater than the next element
            if (arr[j] < arr[j + 1]) {
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    return arr;
}

rl.question('Enter elements of the array (comma-separated): ', (input) => {
    const userArray = input.split(',').map(Number);

    const sortedArray = bubbleSortDescending(userArray);

    console.log('Original Array:', userArray);
    console.log('Sorted Array (Descending):', sortedArray);

    rl.close();
});
