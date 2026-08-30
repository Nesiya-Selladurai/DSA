class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int one=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) one++;
        }
        int size=one;
        int zero=0,l=0;
        int maxlen=Integer.MAX_VALUE;
        for(int r=0;r<n+size-1;r++){
            if(nums[r%n]==0) zero++;
            if(r-l+1>size){
                if(nums[l%n]==0) zero--;
                l++;
            }
            if(r-l+1==size){
                maxlen=Math.min(maxlen,zero);
            }
        }
        return (maxlen==Integer.MAX_VALUE) ? 0 :maxlen;
    }
}