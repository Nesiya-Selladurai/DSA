class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int lsum=0,rsum=0,n=cardPoints.length;
      int l=0,r=n-1;
      while(l<k){
        lsum+=cardPoints[l];
        l++;
      } 
      l=l-1;
      int max=lsum;
      while(l>=0){
        lsum-=cardPoints[l--];
        rsum+=cardPoints[r--];
        max=Math.max(max,lsum+rsum);
      }
      return max;
    }
}