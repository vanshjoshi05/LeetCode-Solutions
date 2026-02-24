public class ReversePair {

    long count =0;
    void merge(int arr[],int low , int mid , int high ){
        int temp[]= new int [(high-low)+1];
        int left=low;
        int right=mid+1;
        int k =0;
        while (left<=mid&&right<=high){
            if (arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }
            else{
                temp[k++]=arr[right++];
            }
        }
        while (left<=mid)temp[k++]=arr[left++];
        while (right<=high)temp[k++]=arr[right++];
        for (int i =low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    void reverse(int arr[],int low,int mid ,int high){
        int left=low;
        int right=mid+1;
        for (int i =low;i<=mid;i++){
            while (right<=high&& arr[i]>2L*(arr[right])){
                right++;
            }
            count =count+(right-(mid+1));
        }
    }
    void MS(int arr[], int low, int high){
        if (low>=high)return;
        int mid=(high+low)/2;
        MS(arr,low,mid);
        MS(arr,mid+1,high);
        reverse(arr,low,mid,high);
        merge(arr,low,mid,high);
    }
    public int reversePairs(int[] nums) {
        count =0;
        MS(nums,0,nums.length-1);
        return (int)count ;
    }
}

