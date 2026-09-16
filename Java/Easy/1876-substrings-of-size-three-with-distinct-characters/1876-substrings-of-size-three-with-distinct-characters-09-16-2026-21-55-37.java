class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int cnt=0;
        HashMap<Character,Integer>mp=new HashMap<>(); 
        if(n<3){
            return 0;
        }
        for(int i=0;i<3;i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.size()==3){
                cnt++;
            }
        }
        for(int i=3;i<n;i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-3);
            if(mp.containsKey(ch1)){
                if(mp.get(ch1)==1){
                    mp.remove(ch1);
                }
                else{
                    mp.put(ch1,mp.get(ch1)-1);
                }
            }
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.size()==3){
                cnt++;
            }
        }
        return cnt;
    }
}