class Solution {
    public int[] getAverages(int[] nums, int k) {
      int n=nums.length;
      if(k==0){
        return nums;
      }
      long[] prev=new long[n+1];
      prev[0]=0;
      for(int i=1;i<=n;i++){
        prev[i]=nums[i-1]+prev[i-1];
      }  
      //prev[n]=nums[]
      int[] ans=new int[n];
      Arrays.fill(ans,-1);
      int idx=(2*k) + 1;
      for(int i=k;i<n-k;i++){
        long sum=(prev[i+k+1]-prev[i-k]);
        ans[i]=(int) (sum/idx);
      }
      return ans;
    }
}