class Solution {
    
    static int divisor(int[] arr,int n,int mid){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/(double)mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n =nums.length;
        int max=Integer.MIN_VALUE;
        if(n > threshold  ) return -1;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(divisor(nums,n,mid) <= threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
}