array = [20, 10, 35, 86]

smallest = array[0];

largest = array[0];

        
    for(count = 1; count <= array.length - 1; count ++){
        result = array[count];

       if(result < smallest){
        smallest = result;
        }

        else if(result > largest ){
        largest = result;
        }
    
        else{
            console.log("Invalid input");
        }

    }

console.log("The maximum " + largest);
console.log("The minimum is " + smallest);

