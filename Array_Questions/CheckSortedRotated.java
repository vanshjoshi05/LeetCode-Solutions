class CheckSortedRotated {
    public boolean check(int[] nums) {
        int count =1;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]<=nums[i+1]){
                continue;
            }
            else if (nums[i]>nums[i+1]&& count==1){
                count--;
                
            }
            else{
                return false;
            }

        }
        if (nums[nums.length-1]>nums[0])
            if(count==1){
                count--;
            }
            else{
                return false;
            }

        return true;
    }
}