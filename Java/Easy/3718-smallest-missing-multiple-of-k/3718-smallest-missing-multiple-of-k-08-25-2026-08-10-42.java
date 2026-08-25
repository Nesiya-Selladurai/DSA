class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            set.add(i);
        }int sum=0;
        for(int i=0;i<n;i++){
            sum+=k;
            if((set.contains(sum) && n==1)) return nums[i]+k;
            if(!set.contains(sum)){
                return sum;
            }
        }
        return (n+1)*k;
    }
}