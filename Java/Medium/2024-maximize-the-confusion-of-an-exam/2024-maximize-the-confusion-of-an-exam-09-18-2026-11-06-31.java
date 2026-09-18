class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
      int n=s.length();
      int maxlen=0;
      int l=0,r=0,maxt=0,v=0;
      while(r<n){
        char ch=s.charAt(r);
        if(ch=='F'){
            v++;
        }
        while(l<n && v>k){
            if(s.charAt(l)=='F'){
                v--;
            }
            l++;
        }
        maxt=Math.max(maxt,r-l+1);
        r++;
      } 
      int maxf=0;
      l=0;
      r=0;
      v=0;
      while(r<n){
        char ch=s.charAt(r);
        if(ch=='T'){
            v++;
        }
        while(l<n && v>k){
            if(s.charAt(l)=='T'){
                v--;
            }
            l++;
        }
        maxf=Math.max(maxf,r-l+1);
        r++;
      } 
      maxlen=Math.max(maxt,maxf);
      return maxlen;
    }
}