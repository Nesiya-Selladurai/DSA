class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=0,sub=0;
        for(int i=0;i<n;i++){
                sub+=gain[i];
                max=Math.max(max,sub);
        }
        return max;
    }
}