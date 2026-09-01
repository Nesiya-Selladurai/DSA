class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int n=a.length();
        int l=0,r=0,maxlen1=0;
        int v=0;
        while(r<n){
            if(a.charAt(r)=='F'){
                v++;
            }
            while(l<n && v>k){
                if(a.charAt(l)=='F')
                    v--;
                l++;
            }
            maxlen1=Math.max(maxlen1,r-l+1);
            r++;
        }
        l=0;
        r=0;
        v=0;
        int maxlen2=0;
        while(r<n){
            if(a.charAt(r)=='T'){
                v++;
            }
            while(l<n && v>k){
                if(a.charAt(l)=='T'){
                    v--;
                }
                l++;
            }
            maxlen2=Math.max(maxlen2,r-l+1);
            r++;
        }
        return Math.max(maxlen1,maxlen2);
    }
}