import java.util.Arrays;
import java.util.Scanner;



public class ArrayFunUserArray {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       // int number = scanner.nextInt();

        int[] arr = new int[5];

        System.out.println("Please enter 5 numbers");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("You entered:");
        System.out.println(Arrays.toString(arr));
    }
}
