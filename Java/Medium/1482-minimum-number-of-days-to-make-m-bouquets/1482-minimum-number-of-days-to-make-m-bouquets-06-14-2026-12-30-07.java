class Solution {
    static boolean possible(int[] arr,int n,int m,int k,int mid){
        int cnt=0;
        int bloom=0;
        for(int i=0;i<n;i++){
        if (arr[i] <= mid) {
            cnt++;
            if (cnt == k) {
                bloom++; 
                cnt = 0; 
            }
            } else {
            cnt = 0;
            }}
        return bloom>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        if((long)(m*k) >n ) return -1;
      for(int i=0;i<n;i++){
        min=Math.min(min,bloomDay[i]);
        max=Math.max(max,bloomDay[i]);
      } 
      int low=min,high=max;
      int ans=-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(possible(bloomDay,n,m,k,mid)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return ans;
    }
}