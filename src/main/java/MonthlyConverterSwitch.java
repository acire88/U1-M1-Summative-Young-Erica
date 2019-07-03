import java.util.Scanner;

public class MonthlyConverterSwitch {
    public static void main(String[] args){
        System.out.println("Enter a number between 1 and 12");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        switch(num){
            case 1: System.out.println(month[0]);
                break;
            case 2: System.out.println(month[1]);
                break;
            case 3: System.out.println(month[2]);
                break;
            case 4: System.out.println(month[3]);
                break;
            case 5: System.out.println(month[4]);
                break;
            case 6: System.out.println(month[5]);
                break;
            case 7: System.out.println(month[6]);
                break;
            case 8: System.out.println(month[7]);
                break;
            case 9: System.out.println(month[8]);
                break;
            case 10: System.out.println(month[9]);
                break;
            case 11: System.out.println(month[10]);
                break;
            case 12: System.out.println(month[11]);
                break;

            default: System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");



        }

    }

}
