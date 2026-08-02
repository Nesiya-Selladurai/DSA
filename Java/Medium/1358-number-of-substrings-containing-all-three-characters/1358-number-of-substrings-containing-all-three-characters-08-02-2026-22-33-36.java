class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length(),ans=0,min;
        int[] last=new int[3];
        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
            min=Math.min(last[0],last[1]);
            ans+=Math.min(min,last[2])+1;
            }
        }
        return ans;
    }
}