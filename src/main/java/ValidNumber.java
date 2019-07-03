import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args){

      int num = 0;
      boolean number;


        System.out.println("Enter a number between 1 and 10: ");

        do{
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            if (num > 1 && num < 10) {
                number = false;
               // System.out.println(num);


            }else {
                System.out.println("You must enter a number between 1 and 10, please try again.");
                number = true;


            }
        } while(number);
            System.out.println("Your're Done! " + num);


        }

    }
