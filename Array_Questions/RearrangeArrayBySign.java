public class RearrangeArrayBySign {

    public int[] rearrangeArray(int[] nums) {
        int positive=0;
        int negative=1;
        int n =nums.length;
        int array[]=new int[n];
        for (int i =0;i<n;i++){
            if (nums[i]<0){
                array[negative]=nums[i];
                negative+=2;
            }else{
                array[positive]=nums[i];
                positive+=2;
            }
        }
        return array;
    }
}

