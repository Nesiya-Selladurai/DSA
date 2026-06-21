class Solution {
    public boolean canPartition(int[] nums) {
       int n=nums.length;
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       } 
       if(sum%2!=0){
        return false;}
    int t=sum/2;
    boolean[] b=new boolean[t+1];
    b[0]=true;
    for(int i:nums){
        for(int j=t;j>=i;j--){
            b[j]=b[j] || b[j-i];
        }
    }
       return b[t];
    }
}