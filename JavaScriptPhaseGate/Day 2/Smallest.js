array = [20, 10, 35, 86];
       
smallest = array[0];
        
    for(count = 1; count <= array.length - 1; count ++){
        result = array[count];

        if(result < smallest){
            smallest = result;
        }
    }

console.log(smallest);

