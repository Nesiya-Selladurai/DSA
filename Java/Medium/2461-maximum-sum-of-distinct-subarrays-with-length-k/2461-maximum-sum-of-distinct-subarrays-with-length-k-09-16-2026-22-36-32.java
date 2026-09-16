class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0,val=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        if(n<k){
            return 0;
        }
        for(int i=0;i<k;i++){
            int ch=nums[i];
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            val+=nums[i];
        }
        if(mp.size()==k){
            sum+=val;
        }
        for(int i=k;i<n;i++){
            int ch=nums[i];
            int ch1=nums[i-k];
            val+=nums[i]-nums[i-k];
            if(mp.containsKey(ch1)){
                if(mp.get(ch1)==1){
                    mp.remove(ch1);
                }
                else{
                    mp.put(ch1,mp.get(ch1)-1);
                } 
            }
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.size()==k){
                sum=Math.max(sum,val);
            }
        }
        return sum;
    }
}