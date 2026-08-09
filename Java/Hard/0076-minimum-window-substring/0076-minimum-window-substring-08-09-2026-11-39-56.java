class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int minlen=Integer.MAX_VALUE,start=-1;
        int l=0,r=0,cnt=0;
        while(r<n){
            if(mp.containsKey(s.charAt(r))){
                if(mp.get(s.charAt(r))>0)
                cnt++;
                mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
            }
            else
            mp.put(s.charAt(r),-1);
            while(cnt==m){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    start=l;
                }
                mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                if(mp.get(s.charAt(l))>0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return start==-1 ? "" : s.substring(start,start+minlen);
    }
}