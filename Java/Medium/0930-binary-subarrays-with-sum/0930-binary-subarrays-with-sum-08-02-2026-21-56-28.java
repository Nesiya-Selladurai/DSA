class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sum(nums,goal) - sum(nums,goal-1);
    }
    static int sum(int[] a,int g){
        if(g<0){
            return 0;
        }
        int n=a.length,l=0,r=0,sum=0,cnt=0;
        while(r<n){
            sum+=a[r];
            while(sum>g){
                sum-=a[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}