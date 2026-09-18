class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int l=0,r=0,maxlen=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=nums[i];
        }
        int t=cnt-x;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(l<n && sum>t){
                sum-=nums[l];
                l++;
            }
            if(sum==t){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen==-1 ? -1 : n-maxlen;
    }
}