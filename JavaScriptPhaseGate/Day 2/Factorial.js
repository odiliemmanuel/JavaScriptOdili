const prompt = require('prompt-sync')();

digit = prompt("Enter any digit number");

factorial = 1;
       
    for(count = 2; count <= digit; count ++){
        factorial *= count;

    }

console.log(factorial);

