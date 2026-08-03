class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       HashMap<Character,Integer> mp=new HashMap<>();
       int maxLen=0,maxf=0,l=0,r=0;
       while(r<n){
        mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
        maxf=Math.max(maxf,mp.get(s.charAt(r)));
        if((r-l+1)-maxf >k){
            mp.put(s.charAt(l) , mp.get(s.charAt(l))-1);
            maxf=0;
            l++;
        }
        if((r-l+1) - maxf <=k){
            maxLen=Math.max(maxLen,(r-l+1));
        }
        r++;
       } 
       return maxLen;
    }
}