class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int n=nums.length;
        if(n==1) return 1;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int idx1=0,idx2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max)
            idx1=i+1;
            if(nums[i]==min)
            idx2=i+1;
        }
        int left=Math.max(idx1,idx2);
        int right=n- Math.min(idx1,idx2) + 1;
        int both=Math.min(idx1,idx2)+ (n-Math.max(idx1,idx2)+1);
        return Math.min(left,Math.min(right,both));
    }
}