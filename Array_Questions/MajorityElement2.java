import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {
        int count1 =0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n =nums.length;
        for (int i=0;i<nums.length;i++){
            if (count1==0 && el2!=nums[i]){
                count1=1;
                el1=nums[i];
            }
            else if (count2==0 && el1!=nums[i]){
                count2=1;
                el2=nums[i];
            }
            else if (nums[i]==el1){
                count1++;
            }
            else if (nums[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int countOne=0;
        int countTwo=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]==el1){
                countOne++;
            }
            if (nums[i]==el2){
                countTwo++;
            }
        }
        List <Integer> ls =new ArrayList<>();
        if (countOne>(n/3)){
            ls.add(el1);
        }
        if (countTwo>(n/3)){
            ls.add(el2);
        }
        return ls;
        
    }
}

