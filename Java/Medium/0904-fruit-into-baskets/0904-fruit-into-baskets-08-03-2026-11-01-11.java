class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxLen=0,r=0,l=0;
        while(r<n){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            if(mp.size()>2){
                int f=fruits[l];
                int val=mp.get(f);
                if(val==1){
                    mp.remove(f);
                }else{
                    mp.put(f,val-1);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}