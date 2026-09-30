class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        int r=0,l=0,cnt=0;
        while(r<n){
            char ch=s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.containsKey(ch) && mp.get(ch)==k ){
                cnt+=n-r;
                char c1=s.charAt(l);
                if(mp.get(c1)==1){
                    mp.remove(c1);
                }
                else
                mp.put(c1,mp.get(c1)-1);
                l++;
            }
            r++;
        }
        return cnt;
    }
}