class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer> mp =new HashMap<>();
        int l=0,r=0,maxlen=0,maxfreq=0;
        while(r<n){
            char ch=s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,mp.get(ch));
            while(l<n && (r-l+1)-maxfreq >k){
                char c1=s.charAt(l);
                if(mp.get(c1)==1){
                    mp.remove(c1);
                }
                else{
                    mp.put(c1,mp.get(c1)-1);
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}