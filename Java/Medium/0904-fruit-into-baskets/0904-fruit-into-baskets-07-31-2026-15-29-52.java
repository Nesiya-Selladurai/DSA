class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxLen=0,l=0,r=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            if(mp.size()>2){
                int val=mp.get(fruits[l]);
                if(val==1){
                    mp.remove(fruits[l]);
                }
                else
                mp.put(fruits[l],val-1);
                l++;
            }
            if(mp.size()<=2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}