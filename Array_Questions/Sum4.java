import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
     List<List<Integer>> ls = new ArrayList<>();
     long sum=0;
     Arrays.sort(nums);
     for (int i =0;i<nums.length;i++){
        if (i>0&&nums[i]==nums[i-1])continue;
        for (int j=i+1;j<nums.length;j++){
            if (j>i+1&&nums[j]==nums[j-1])continue;
            int k=j+1;
            int l=nums.length-1;
            while (k<l){
                sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                if (sum==target){
                    ls.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                    while(k<l&&nums[k]==nums[k-1])k++;
                    while (k<l&&nums[l]==nums[l+1])l--;
                }
                else{
                    if (sum<target)k++;
                    else{
                        l--;
                    }
                }
            }
        }
    
       
    }
    return ls;
    }
}

