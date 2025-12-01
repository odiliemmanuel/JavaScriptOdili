public class PerfectNumberRange {
        public static void main(String...Odili) {
           
            for(int count = 1; count <= 1000; count ++){
                 int number = count;
                int factor = 0;

                for(int counter = 1; counter < number; counter++){
                    if(number % counter == 0){
                    factor += counter;
             }  
            }
                if(factor == count){
                    System.out.print(count + " ");
                }
            
               
      }

    }

}
