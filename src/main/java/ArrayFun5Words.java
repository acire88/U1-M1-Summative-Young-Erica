import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // int totalWords = input.nextInt();

        String[] words = new String[5];

        System.out.println("Please enter 5 words:");

        for(int i = 0; i < 5; i++){
            words[i] = input.nextLine();
        }
        System.out.println("You entered: ");
        System.out.println(Arrays.toString(words));

    }
}
