class Solution {
    public String minWindow(String s, String t) {
       int n=s.length(),m=t.length();
       HashMap<Character,Integer> mp=new HashMap<>();
       for(int i=0;i<m;i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
       }
       int l=0,r=0,min=Integer.MAX_VALUE,start=-1,cnt=0;
       while(r<n){
            if(mp.containsKey(s.charAt(r)) && mp.get(s.charAt(r))>0){
                cnt++;
                mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
            }
            else{
                mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)-1);
            }
            while(cnt==m){
                if(r-l+1<min){
                    min=r-l+1;
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
        return start==-1?"":s.substring(start,start+min); 
    }
}