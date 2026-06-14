class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] res=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int k =target-nums[i];
            if(mp.containsKey(k) && i!=mp.get(k))
            {
                res[0]=i;
                res[1]=mp.get(k);
                return res;
            }
            mp.put(nums[i],i);
        }
        return null;
    }
}