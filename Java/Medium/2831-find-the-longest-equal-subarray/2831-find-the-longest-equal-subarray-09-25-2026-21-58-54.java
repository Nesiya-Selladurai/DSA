class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.size();
        int l=0,r=0,maxval=0;
        int maxfreq=0;
        while(r<n){
            int a=nums.get(r);
            mp.put(a,mp.getOrDefault(a,0)+1);
            maxfreq=Math.max(maxfreq,mp.get(a));
            int windowSize = r-l+1;
            int deletions = windowSize - maxfreq;
            while(l<n && deletions>k){
                int val=nums.get(l);
                if(mp.get(val)==1){
                    mp.remove(val);
                }
                else{
                    mp.put(val,mp.get(val)-1);
                }
                l++;
                windowSize = r- l+1;
                deletions= windowSize - maxfreq;
                
            }
            maxval=Math.max(maxval,maxfreq);
            r++;
        }
        return maxval;
    }
}