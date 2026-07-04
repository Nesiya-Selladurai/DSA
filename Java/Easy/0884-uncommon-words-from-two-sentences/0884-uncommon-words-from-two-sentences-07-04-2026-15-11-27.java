class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String[] a=s1.split(" ");
       String[] b=s2.split(" ");
       int n=a.length,m=b.length;
       HashMap<String,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++){
    
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
       }
       for(int i=0;i<m;i++){

            mp.put(b[i],mp.getOrDefault(b[i],0)+1);
       }
       int k=mp.size();int i=0;
       ArrayList<String> ans=new ArrayList<>();
       for(Map.Entry<String,Integer> en:mp.entrySet()){
        if(en.getValue()<=1){
            ans.add(en.getKey());
        }
       }
      return ans.toArray(new String[0]);
    }
}