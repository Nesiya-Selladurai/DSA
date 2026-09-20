class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0,cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();    
        for(int i=0;i<n;i++){
            sum+=nums[i];
            sum=sum%k;
            if(sum==0 && i>0){
                return true;
            }
            if(mp.containsKey(sum) && i-mp.get(sum)>1){
                return true;
            }
            if(!mp.containsKey(sum))
            mp.put(sum,i);
        }
        return false;
    }
}