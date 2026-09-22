class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==2){
                    l1.add(e.getKey());
                }
        }
        return l1;
    }
}