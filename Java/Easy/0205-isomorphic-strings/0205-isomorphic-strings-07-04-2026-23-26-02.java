class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String,String> mp=new HashMap<>();
        String[] s1=s.split("");
        String[] s2=t.split("");
        if(s1.length!=s2.length) return false;
        for(int i=0;i<s1.length;i++){
            if(mp.containsKey(s1[i])){
                if(!mp.get(s1[i]).equals(s2[i])){
                    return false;
                }
            }
            else{
                if(mp.containsValue(s2[i]))
                return false;
                mp.put(s1[i],s2[i]);
            }
        }
        return true;
    }
}