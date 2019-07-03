import java.util.Scanner;

public class MonthlyConverterIf {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 12");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec","pop","hop"};
        if (num >= 1 && num < 13) {
            System.out.println(month[num-1] );
        }
       else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
