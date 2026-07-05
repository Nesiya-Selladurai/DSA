class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> mp=new HashMap<>();
      if(s.length()!=t.length()) return false;
      for(int i=0;i<s.length() ;i++){
        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
      }
      for(int i=0;i<t.length();i++){
        if(!mp.containsKey(t.charAt(i)))
        {
            return false;
        }
        int val=mp.get(t.charAt(i));
        if(val==1){
            mp.remove(t.charAt(i));
            }
        else{
            mp.put(t.charAt(i),val-1);
            }
        }
      
      return mp.size()==0 ;
    }
    
}