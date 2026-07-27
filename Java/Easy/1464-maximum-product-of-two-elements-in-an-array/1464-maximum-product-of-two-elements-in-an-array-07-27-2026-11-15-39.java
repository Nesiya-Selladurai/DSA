class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int j,max=0,curr;
        for(int i=0;i<n;i++){
            j=i+1;
            while(j<n){
                curr=(nums[i]-1)*(nums[j]-1);
                max=Math.max(max,curr);
                j++;
            }
        }return max;
    }
}