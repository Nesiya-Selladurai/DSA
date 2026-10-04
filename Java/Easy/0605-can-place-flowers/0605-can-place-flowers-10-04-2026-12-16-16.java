class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int m=f.length;
        if(n==0){
            return true;
        }
        if(m==1){
            if(f[0]==0 ) return true;
            else return false;
        }
        else{
            if(f[0]==0 && f[1]==0){
            f[0]=1;
            n--;
            }
        for(int i=1;i<f.length-1;i++){
            //if(n==0) return true;
            if(f[i]==0){
                if(f[i-1]==0 && f[i+1]==0){
                    f[i]=1;
                    n--;
                }
            }
        }
        if(f[m-1]==0 && f[m-2]==0){
            f[m-1]=1;
            n--;
        }
    
        }
        return n<=0 ? true:false;
    }
}