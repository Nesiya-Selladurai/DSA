class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return sum(nums,k)-sum(nums,k-1); 
    }
    static int sum(int[] nums,int k)
    {
        if(k<0) return 0;
        int n=nums.length;
        int maxLen=0,l=0,r=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        while(r<n){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.size()>k){
                int ch=nums[l];
                if(mp.get(ch)==1){
                    mp.remove(ch);
                }
                else{
                    mp.put(ch,mp.get(ch)-1);
                }
                l++;
            }
            maxLen+=r-l+1;
            r++;
        }
        return maxLen;
}
}