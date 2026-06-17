class Solution {
    static int ship(int[] w, int capacity){
        int n =w.length;
        int load=0,day=1;
        for(int i=0;i<n;i++){
            if(load+w[i] > capacity){
                day+=1;
                load=w[i];
            }
            else{
                load+=w[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(ship(weights,mid)<=days){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}