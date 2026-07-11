class Solution {
    public int maxDepth(String s) {
    char[] s1=s.toCharArray();
    int n=s1.length;
    int cnt=0,maxcnt=0;
    for(int i=0;i<n;i++){
        if(s1[i]=='(')
            cnt++;
        else if(s1[i]==')')
            cnt--;
        maxcnt=Math.max(cnt,maxcnt);
    }
    return maxcnt;
    }
}