const prompt = require('prompt-sync')();

word = prompt("Enter an String ");
    
firstWord = word.substring(0,1).toUpperCase();

remaining = word.substring(1);

console.log(firstWord + remaining);
 

