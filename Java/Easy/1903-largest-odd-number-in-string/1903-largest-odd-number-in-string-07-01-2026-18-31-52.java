class Solution {
    public String largestOddNumber(String num) {
    int n=num.length();
    int i,idx=-1;
    for(i=n-1;i>=0;i--){
        if((num.charAt(i)-'0') % 2==1){
            idx=i;
            break;
        }
    }
    if(idx==-1) return "";
    i=0;
    while(i<=idx && num.charAt(i) =='0') i++;
    return num.substring(i,idx+1);
    }
}