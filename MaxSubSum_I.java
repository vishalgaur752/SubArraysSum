public class MaxSubSum_I {
    public static void printSubArr(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                System.out.print("sum : " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
                if(minSum > sum) {
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximun subarr sum : " + maxSum);
        System.out.print("manimun subarr sum : " + minSum);


    }

    public static void main(String[] args) {
        int nums[] = { 1, -2, 6, -1, 3 };
        printSubArr(nums);
    }
}
