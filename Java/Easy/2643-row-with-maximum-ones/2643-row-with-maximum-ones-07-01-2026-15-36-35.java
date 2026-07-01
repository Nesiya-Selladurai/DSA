class Solution {
    static int cnt(int[] [] arr,int i,int  m){
        int cnt=0;
        for(int j=0;j<m;j++)
        {
            if(arr[i][j]==1){
                cnt++;
            }
        }
            return cnt;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int mx=0,idx=0,res;
        for(int i=0;i<n;i++){
            res=cnt(mat,i,m);
            if(res>mx){
                mx=res;
                idx=i;
            }
        }
        return new int[]{idx,mx};
    }
}