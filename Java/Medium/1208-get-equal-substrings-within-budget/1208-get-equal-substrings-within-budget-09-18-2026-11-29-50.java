class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       int n=s.length();
       if(s.length()!=t.length()) return 0;
       //if(maxCost==0) return 1;
       int l=0,r=0,maxlen=0,sum=0;
       while(r<n){
        sum+=Math.abs((s.charAt(r) - t.charAt(r)));
        while(l<n && sum>maxCost){
            sum-= Math.abs((s.charAt(l) - t.charAt(l)));
            l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
       }
       return maxlen;
    }
}