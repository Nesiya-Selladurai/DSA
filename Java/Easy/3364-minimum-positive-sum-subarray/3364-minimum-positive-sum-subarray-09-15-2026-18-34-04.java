class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        if(l>n || r>n){
            return -1;
        }
        int minsum=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int l1=0,r1=0,sum=0;
        while(r1<n){
            sum+=nums.get(r1);
            if( (r1-l1+1) >i ){
                sum-=nums.get(l1);
                l1++;
            }
            if(sum>0 && (r1-l1+1)==i){
                minsum=Math.min(minsum,sum);
            }
            r1++;
        }
        }
        return minsum==Integer.MAX_VALUE ? -1:minsum;
    }
}