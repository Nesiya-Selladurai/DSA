class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return check(nums,k)-check(nums,k-1); 
    }
    static int check(int[]nums,int k){
        if(k==0){
            return 0;
        }
        int l=0,r=0;
        int cnt=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        while(r<n){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(l<n && mp.size()>k){
                if(mp.get(nums[l])==1){
                    mp.remove(nums[l]);
                }
                else{
                    mp.put(nums[l],mp.get(nums[l])-1);
                }
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}