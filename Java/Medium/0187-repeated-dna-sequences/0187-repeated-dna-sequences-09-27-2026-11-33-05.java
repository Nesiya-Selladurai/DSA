class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        HashMap<String,Integer> mp=new HashMap<>();
        List<String> l1=new ArrayList<>();
        for(int i=0;i<=n-10;i++){
            String str=s.substring(i,i+10);
            mp.put(str,mp.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String,Integer> e:mp.entrySet()){
            if(e.getValue()>1){
                l1.add(e.getKey());
            }
        }
        return l1;
    }
}