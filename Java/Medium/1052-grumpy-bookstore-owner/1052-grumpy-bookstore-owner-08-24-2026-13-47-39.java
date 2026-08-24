class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        int n=customers.length;
        int satisfied=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]!=1){
                satisfied+=customers[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int l=i;
            int sum=0;
            while(l<n && l< i+m){
                if(grumpy[l]==1){
                    sum+=customers[l];
                }
                l++;
            }
            max=Math.max(max,sum);
        }
        return max+satisfied;
    }
}