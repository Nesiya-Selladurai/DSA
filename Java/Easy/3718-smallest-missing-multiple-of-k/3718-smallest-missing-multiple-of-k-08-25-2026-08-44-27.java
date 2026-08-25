class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            set.add(i);
        }
        int sum=k;
        while(set.contains(sum)){
            sum+=k; 
        }
        return sum;
    }
}