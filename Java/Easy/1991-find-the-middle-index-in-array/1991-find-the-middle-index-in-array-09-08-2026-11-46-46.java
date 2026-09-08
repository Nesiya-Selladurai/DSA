class Solution {
    public int findMiddleIndex(int[] nums) {
       int n=nums.length;
       int l=0,r=n-1,sum=nums[0];
       int[] num=new int[n];
       num[0]=0;
       for(int i=1;i<n;i++){
        num[i]=num[i-1]+nums[i-1];
        sum+=nums[i];
       }
       for(int i=0;i<n;i++){
        int leftsum=num[i];
        int rightsum=sum-num[i]-nums[i];
        if(leftsum==rightsum) return i;
       }
       return -1;
    }
}