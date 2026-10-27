class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return true;
        }
        int i=0,res=0;
        while(i<n){
            if(i>res){
                return false;
            }
            res=Math.max(res,i+nums[i]);
            if(res==n-1){
                return true;
            }
            i++;
        }
        return true;
    }
}