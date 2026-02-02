import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum=new HashMap<>();
        int n =nums.length;
        for (int i =0;i<n;i++){
            if (sum.containsKey(target-nums[i])){
                return new int[] {sum.get(target-nums[i]),i};
            } else {
                sum.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}