import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualToK {

    public int subarraySum(int[] nums, int k) {
        int preSum=0;
        int count=0;
        Map<Integer,Integer>sub=new HashMap<>();
        sub.put(0,1);
        for (int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int rem=preSum-k;
            if (sub.containsKey(rem)){
                count+=sub.get(rem);
            }
            sub.put(preSum,sub.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}

