// JavaScript code below
// Use printErr(...) to debug your solution.

function findLargest(numbers) {
    // Your code goes here
    var largestNumber = 0;
    numbers.forEach(function(number){
        if(number>largestNumber) largestNumber = number;
    });
    return largestNumber;
}