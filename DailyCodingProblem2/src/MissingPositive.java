import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingPositive {

    public static void main(String[] args) {


        int[] array1 = {15,16,20};
        int[] array2 = {-5,-1,0};
        int[] array3 = {15,16,20};
        int[] array4 = {15,16,20};

        System.out.println(missingPositive(array1));
    }

    public static int missingPositive (int[] nums){
        int n = nums.length;

        for(int i=0; i < nums.length; i++){
                if(nums[i] <= 0 || nums[i] > n){
                    nums[i] = 0;
                }
        }

        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++){

                int difference = nums[i+1]-nums[i];
                if(difference>1){
                    x = nums[i]+1;
                } else{
                x = nums[nums.length];
            }
        }
    }
        return x;

    }
}
