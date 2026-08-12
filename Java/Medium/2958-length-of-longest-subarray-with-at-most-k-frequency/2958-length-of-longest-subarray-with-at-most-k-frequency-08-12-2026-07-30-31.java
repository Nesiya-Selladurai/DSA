class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen=0,freq=0,l=0,r=0,n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while(mp.get(nums[r])>k){
                if(mp.get(nums[l])==1) mp.remove(nums[l]);
                else mp.put(nums[l],mp.get(nums[l])-1);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}