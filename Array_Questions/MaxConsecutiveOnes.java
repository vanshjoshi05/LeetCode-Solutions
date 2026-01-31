public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=0;
        for (int num:nums){
            if (num==1){
                count++;
                if (maxCount<count){
                    maxCount =count;
                }
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}

