public class PartTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long begin = System.nanoTime();
        int iterativeSum = sumIteratively(arr);
        long end = System.nanoTime();
        long iterativeTime = (end - begin);
        System.out.println("Iterative sum: "+iterativeSum+"\nTook "+iterativeTime+" ns.");

        begin = System.nanoTime();
        int recursiveSum = sumRecursively(arr, 0);
        end = System.nanoTime();
        long recursiveTime = (end - begin);
        System.out.println("Recursive sum: "+recursiveSum+"\nTook "+recursiveTime+" ns.");
    }

    public static int sumIteratively(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum+=i;
        }
        return sum;
    }
    public static int sumRecursively(int[] nums, int idx) {
        if (idx==nums.length-1) {
            return nums[idx];
        }
        return nums[idx]+sumRecursively(nums, idx+1);
    }
}