const prompt = require('prompt-sync')();

number = prompt("Enter an Integer ");

if(number % 3 == 0){

console.log("Divisible");
}

else{
console.log("Not Divisible");
}
