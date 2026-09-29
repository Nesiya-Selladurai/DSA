class Solution {
    public long validSubstringCount(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        int[] f=new int[26];
        for(int i=0;i<m;i++){
            f[w2.charAt(i)-'a']++;
        }
        int l=0,r=0,cnt=0;
        long count=0;
        while(r<n){
            if(f[w1.charAt(r)-'a'] > 0)
                cnt++;
            f[w1.charAt(r)-'a']--;
            while(cnt==m){
                count+=n-r;
                f[w1.charAt(l)-'a']++;
                if(f[w1.charAt(l)-'a'] > 0)
                    cnt--;
                l++;
            }
            r++;
        }
        return count;
    }
}