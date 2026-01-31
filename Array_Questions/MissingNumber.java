public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2; // sum of numbers from 0 to n
        for (int num : nums) {
            sum -= num;  // remove existing numbers
        }
        return sum; // leftover is the missing number
    }

}
