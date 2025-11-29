numberOne = 12;

numberTwo = 8;

gcd = 0;

for(count = 1; count < numberOne && count <= numberTwo; count ++){
    if(numberOne % count  == 0 && numberTwo % count == 0){
        gcd = count;
    }
   
    

}

console.log(gcd);
