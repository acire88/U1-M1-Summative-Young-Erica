import java.util.Arrays;

public class ArrayFunReverseIt {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));

        //for(int i = 0; i < 5; i++){

       // }
        int arr;
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            arr = nums[start];
            nums[start] = nums[end];
            nums[end] = arr;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));

    }
}
