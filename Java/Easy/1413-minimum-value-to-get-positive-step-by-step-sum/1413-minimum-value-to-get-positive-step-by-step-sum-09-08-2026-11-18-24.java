class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            min=Math.min(min,sum);
        }
        return min==1 || 1-min<1 ? 1 : 1-min;
    }
}