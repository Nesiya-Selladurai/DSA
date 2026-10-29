class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int cnt=0,maxlen=0;
        for(int i=0;i<n;i++){
            cnt+=(nums[i]==1 ? 1 : -1);
            if(mp.containsKey(cnt)){
                maxlen=Math.max(maxlen,i-mp.get(cnt));
            }
            else{
                mp.put(cnt,i);
            }
        }
        return maxlen;
    }
}