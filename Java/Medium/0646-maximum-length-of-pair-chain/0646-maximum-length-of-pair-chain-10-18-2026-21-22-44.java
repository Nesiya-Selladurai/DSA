class Solution {
    public int findLongestChain(int[][] pairs) {
     Arrays.sort(pairs,(a,b) ->
     Integer.compare(a[1],b[1])
     );
     int cnt=0,end=Integer.MIN_VALUE;
     for(int i=0;i<pairs.length;i++){
        if(pairs[i][0]>end){
            cnt++;
            end=pairs[i][1];
        }
     }
     return cnt;
    }
}