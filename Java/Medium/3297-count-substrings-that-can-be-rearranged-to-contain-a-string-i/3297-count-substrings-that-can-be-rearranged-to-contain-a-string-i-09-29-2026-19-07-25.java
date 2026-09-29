class Solution {
    public long validSubstringCount(String w1, String w2) {
        HashMap<Character ,Integer> mp=new HashMap<>();
        int[] a=new int[26];
        int[] b=new int[26];
        int n=w1.length();
        int m=w2.length();
        for(int i=0;i<m;i++){
            b[w2.charAt(i) - 'a']++;
        }
        int l=0,cnt=0;
        long count=0;
        for(int r=0;r<n;r++){
            a[w1.charAt(r) - 'a']++;
            if(a[w1.charAt(r) - 'a'] <= b[w1.charAt(r) - 'a']){
                cnt++;
            }
            while(cnt==m){
                count+= n - r;
                if(a[w1.charAt(l) - 'a'] <= b[w1.charAt(l) - 'a']){
                    cnt--;
                }
                a[w1.charAt(l) - 'a']--;
                l++;
            }
        }
        return count;

    }
}