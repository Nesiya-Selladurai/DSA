class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> mp=new HashMap<>();
    String[] s1=s.split(" ");
    if(pattern.length()!=s1.length){
        return false;
    }int i=0;
    for(char ch:pattern.toCharArray()){
        if(mp.containsKey(ch)){
            if(!mp.get(ch).equals(s1[i])){
                return false;
            }
        }
        else{
            if(mp.containsValue(s1[i])){
                return false;
            }
            mp.put(ch,s1[i]);
        }
        i++;
    }
    return true;
    }
}