import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        nums = ordenar(nums);

        System.out.println(nums[0]);

    }

    public static int[] ordenar(int[] nums){

        int temp = 0;

        for (int j = 0; j < nums.length-1; j++) {
            for (int i = 0; i < (nums.length-i); i++) {
                if (nums[i] > nums[i+1]){
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }

        }

        return nums;

    }
}
