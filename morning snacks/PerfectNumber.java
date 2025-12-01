import java.util.Scanner;   
     public class PerfectNumber {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);
        

            System.out.println("Enter any number ");
                int number = input.nextInt();
                int factor = 0;
            for(int count = 1; count < number; count ++){
                if(number % count == 0){
                factor += count;
               
            }
               
       }
            System.out.println("Sum of the number: " + factor);

                if(factor == number ){
                    System.out.println("Number is a Perfect Number");
   
                }
                else{
                    System.out.println("Number is not a Perfect Number");
                }


        }

    }
