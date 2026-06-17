class Solution {
    static void reverse(int[] a,int s,int e){
        while(s<e){
            int temp=a[s];
            a[s++]=a[e];
            a[e--]=temp;
        }
    }
    public int findMin(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                k=i;
                break;
            }
        }
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
        return nums[0];
    }
}