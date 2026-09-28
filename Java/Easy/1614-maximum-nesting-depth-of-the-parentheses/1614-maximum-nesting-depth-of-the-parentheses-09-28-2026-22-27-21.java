class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int maxlen=0,cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(' ){
                cnt++;
            }
            else if(s.charAt(i)==')')
            cnt--;
            maxlen=Math.max(maxlen,cnt);
        }
        return maxlen;
    }
}