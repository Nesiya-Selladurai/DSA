class Solution {
    public String frequencySort(String s) {
       //int n=s.length();
       HashMap<String,Integer> mp=new HashMap<>();
        String[] s1=s.split("");
        for(int i=0;i<s1.length;i++){
            mp.put(s1[i],mp.getOrDefault(s1[i],0)+1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder ans=new StringBuilder();
        for(Map.Entry<String,Integer> en: list){
            int val=en.getValue();
            String key=en.getKey();
            while(val>0){
            ans.append(key);
            val--;
            }

        }
        return ans.toString();
    }
}