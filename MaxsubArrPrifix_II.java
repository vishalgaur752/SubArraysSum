public class MaxsubArrPrifix_II {
    public static void printmaxSubArr(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prifix[] = new int[nums.length];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prifix[end] : prifix[end] - prifix[start];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("maxsubArrSum : " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { 1, -2, 6, -1, 3 };
        printmaxSubArr(nums);
    }
}
