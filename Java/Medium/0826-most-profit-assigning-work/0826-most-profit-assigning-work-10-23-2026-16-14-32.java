class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
       int[] [] job=new int[n][2];
       for(int i=0;i<n;i++){
            job[i][0]=difficulty[i];
            job[i][1]=profit[i];
       } 
       Arrays.sort(job,(a,b)->
       Integer.compare(a[0],b[0]));
       Arrays.sort(worker);
       int j=0,totalwork=0,maxprofit=0;
       for(int ability:worker){
        while(j<n && job[j][0]<=ability){
            maxprofit=Math.max(maxprofit,job[j][1]);
            j++;
        }
        totalwork+=maxprofit;
       }
       return totalwork;
    }
}