class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int req=sum-k;
            if(mp.containsKey(req)){
                cnt+=mp.get(req);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}