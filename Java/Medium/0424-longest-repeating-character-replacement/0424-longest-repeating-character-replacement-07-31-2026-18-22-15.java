class Solution {
    public int characterReplacement(String s, int k) {
       int maxLen=0,maxFreq=0,l=0,r=0,n=s.length();
       int[] mp=new int[26];
       Arrays.fill(mp,0);
       while(r<n){
            mp[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,mp[s.charAt(r)-'A']);

            if((r-l+1)-maxFreq > k){
                mp[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxFreq <= k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            
            r++;
       } 
       return maxLen;
    }
}