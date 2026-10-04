class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0,cnt=0;
        if(s.length == 0){
            return 0;
        }
        while(l<g.length && r<s.length ){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}