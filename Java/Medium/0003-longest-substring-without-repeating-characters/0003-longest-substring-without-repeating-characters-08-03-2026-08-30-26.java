class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length(),l=0,r=0;
        int maxLen=0;
        while(r<n){
            char ch=s.charAt(r);
            if(mp.containsKey(ch) && mp.get(ch)>=l){
                l=mp.get(ch)+1;
            }
            mp.put(ch,r);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}