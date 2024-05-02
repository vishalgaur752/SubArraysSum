public class MinSubArrKadaneAlgo {
    public static void printMinmumSum(int nums[]) {
        int minSum = Integer.MAX_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            if (cs > 0) {
                cs = 0;
            }
            minSum = Math.min(cs, minSum);
        }
        System.out.println("Our minimum sub arr sum  is : " + minSum);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printMinmumSum(nums);
    }
}
