class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return sum(nums,k) - sum(nums,k-1);
    }
    static int sum(int[] a,int k){
        if(k<0) return 0;
        int cnt=0,l=0,r=0,n=a.length,sum=0;
        while(r<n){
            if(sum<=k){
                sum+=(a[r] % 2);
            }
            while(sum>k){
                sum-=(a[l]%2);
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}