class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        int n=s.length();
        int m=t.length();
        List<Integer> l1=new ArrayList<>();
        if(n<m){
            return l1;
        }
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<m;i++){
            f1[s.charAt(i)-'a']++;
            f2[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2)){
            l1.add(0);
        }
        int l=0;
        for(int r=m;r<n;r++){
            f1[s.charAt(r)-'a']++;
            f1[s.charAt(l)-'a']--;
            l++;
            if(Arrays.equals(f1,f2)){
                l1.add(l);
            }
        }
        return l1;
    }
}