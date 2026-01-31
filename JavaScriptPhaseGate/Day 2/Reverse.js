numbers = [22,35,42,12]

result = []
counter = 0;
for(count = numbers.length - 1; count >= 0; count --){
    result[counter] = numbers[count]
    counter ++;
}
console.log(result)

//
//  int [] array = {20, 10, 35, 86};
//        int[] result = new int[array.length];
//        int counter = 0;
//        for(int count = array.length -1; count >= 0; count--){
//              result[counter] = array[count];
//              counter++;
//            }
//    
//            System.out.println("The reverse is " + Arrays.toString(result));
//
