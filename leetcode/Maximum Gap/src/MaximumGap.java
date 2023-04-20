public class MaximumGap {

    public static void main(String[] args) {

        int[] nums = new int[]{3,6,9,1,4,5,2,9,3,11};
        System.out.println(MaxDiference(nums));
    }

    public static int MaxDiference(int[] nums){

        int diference;
        int temp = 0;

        if (nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length-1; i++) {
            diference = Math.abs(nums[i] - nums[i+1]);
            if (diference > temp){
                temp = diference;
            }

        }

        return temp;
    }
}
