class Solution {
    public int countValidSubarrays(int[] nums, int x) {
       int n=nums.length;
       int cnt=0;
       for(int i=0;i<n;i++){
        long sum=0;
        for(int j=i;j<n;j++){
            sum+=nums[j];
            int last=(int)(sum%10);
            long val=sum;
            while(val>=10){
                val/=10;
            }
            int first=(int) val;
            if(first==x && last==x){
                cnt++;
            }
        }
       }
       return cnt;
    }
}