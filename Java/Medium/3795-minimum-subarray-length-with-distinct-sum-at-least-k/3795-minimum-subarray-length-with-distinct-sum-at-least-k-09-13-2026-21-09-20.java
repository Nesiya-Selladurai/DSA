class Solution {
    public int minLength(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){ 
                if(!mp.containsKey(nums[r])){
                    sum+=nums[r];
                    mp.put(nums[r],1);
                }
                else{
                     mp.put(nums[r],mp.get(nums[r])+1);
                }
            while(sum>=k){
                 minlen=Math.min(minlen,r-l+1);
                 mp.put(nums[l],mp.get(nums[l])-1);
                 if(mp.get(nums[l])==0){
                    sum-=nums[l];
                    mp.remove(nums[l]);
                 }
                 l++;
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE ? -1 : minlen;
    }
}