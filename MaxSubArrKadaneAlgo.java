public class MaxSubArrKadaneAlgo {
    public static void kadanes(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);
        }
        System.out.println("Our max subarr sum  is : " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(nums);
    }
}
