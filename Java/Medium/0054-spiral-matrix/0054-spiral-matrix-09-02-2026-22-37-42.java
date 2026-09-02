class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
     int n=mat.length;
     int m=mat[0].length;
     int top=0,bottom=n-1;
     int left=0,right=m-1;
     List<Integer> l=new ArrayList<>();
     while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            l.add(mat[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            l.add(mat[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                l.add(mat[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                l.add(mat[i][left]);
            }
            left++;
        }

     }
     return l;
    }
}