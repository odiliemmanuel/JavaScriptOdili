import java.util.Scanner;
    public class Gcd {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

    System.out.println("Enter any number ");
        int firstNumber = input.nextInt();

    System.out.println("Enter another Number ");
        int secondNumber = input.nextInt();
            int gcd = 0; 
            int lcm = 0;        
   
        for(int count = 1; count <= firstNumber && count <= secondNumber; count ++){
            if(firstNumber % count == 0 && secondNumber % count == 0){  
                gcd = count;
                
                lcm = (int)firstNumber * secondNumber / gcd;
                

            }
                   
        }
            System.out.print("The Lcm is " + lcm);
        

        }
    }
