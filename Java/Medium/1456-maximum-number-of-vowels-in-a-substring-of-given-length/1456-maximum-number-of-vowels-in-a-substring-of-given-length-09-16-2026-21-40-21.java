class Solution {
    public int maxVowels(String s, int k) {
      int n=s.length();
    int max=0,sum=0;
    for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            sum++;
        }
    }
    max=sum;
    for(int i=k;i<n;i++){
        char ch=s.charAt(i);
        char ch1=s.charAt(i-k);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
            sum--;
        }
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            sum++;
        }
        max=Math.max(max,sum);
    }
    return max;
    }
}