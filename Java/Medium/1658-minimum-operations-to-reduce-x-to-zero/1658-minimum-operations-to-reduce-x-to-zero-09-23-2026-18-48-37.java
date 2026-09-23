class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int cnt=total-x;
        int sum=0,r=0,l=0;
        int maxlen=-1;
        while(r<n){
            sum+=nums[r];
            while(l<n && sum>cnt){
                sum-=nums[l];
                l++;
            }
                if(sum==cnt){
                    maxlen=Math.max(maxlen,r-l+1);
                }
            r++;
        }
        return maxlen==-1 ? -1:n-maxlen;
    }
}