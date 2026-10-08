class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int l=0,r=0,cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                cnt++;
            }
        }
        return cnt;
    }
}