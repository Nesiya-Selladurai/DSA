
import java.util.Arrays;

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int[] req:requests) {
            freq[req[0]]++;
            freq[req[1]+1]--;
        }
        for(int i=1;i<n;i++){
            freq[i]+=freq[i-1];
        }
        Arrays.sort(nums);
        Arrays.sort(freq,0,n);
        long sum = 0;
        int mod = 1_000_000_007;
        for(int i=0;i<n;i++) {
            sum=(sum+(long)nums[i]*freq[i])%mod;
        }
        return (int)sum;
    }
}
