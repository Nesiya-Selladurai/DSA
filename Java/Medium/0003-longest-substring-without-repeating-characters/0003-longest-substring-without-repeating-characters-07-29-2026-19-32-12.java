class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int l=0,r=0,maxLen=0;
        while(r<n){
            char c=s.charAt(r);
            if(mp.containsKey(c) && (mp.get(c)>=l))
            {
                l=mp.get(c)+1;
            }
            mp.put(c,r);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}