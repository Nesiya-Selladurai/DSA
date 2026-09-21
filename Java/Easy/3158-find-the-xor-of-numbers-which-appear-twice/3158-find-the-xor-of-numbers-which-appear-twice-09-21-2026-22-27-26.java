class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int x=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()==2)
                x^=e.getKey();
        }
        return x;
    }
}