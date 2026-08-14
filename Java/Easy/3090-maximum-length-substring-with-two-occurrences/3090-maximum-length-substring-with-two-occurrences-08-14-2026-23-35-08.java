class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen=0,l=0,r=0;
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        while(r<n){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            while(mp.get(s.charAt(r))>2){
                if(mp.get(s.charAt(l))==1) mp.remove(s.charAt(l));
                else{
                    mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}