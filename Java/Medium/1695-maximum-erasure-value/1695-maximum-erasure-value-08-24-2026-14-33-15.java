class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int l=0,r=0,maxsum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        while(r<n){
            while(mp.containsKey(nums[r])){
                mp.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            mp.put(nums[r],r);
            sum+=nums[r];
            maxsum=Math.max(maxsum,sum);
            r++;
        }
        return maxsum;
    }
}