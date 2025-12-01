import java.util.Scanner;
    public class LeapYear {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);
            int length = 0;
            int year = 0;
            int sum = 0;
        for(year = 1900; year <= 2025; year ++) {
            if(year % 4 == 0 && year % 100 != 0){
                System.out.println(year);
                length = String.valueOf(year).length();
                sum = (int)(length);
            }   
        }
                System.out.println(sum);
        }
    }
