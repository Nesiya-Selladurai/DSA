class Solution {
    public boolean isValid(String s) {
      int n=s.length();
      Stack<Character> s1=new Stack<>();
      for(int i=0;i<n;i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
            s1.push(s.charAt(i));
        }
        else{
            if(s1.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'))
            {
                return false;
            }
            else
            {
            char c=s1.pop();
            if( (s.charAt(i)==')' && c!='(') || (s.charAt(i)=='}' && c!='{') 
            || (s.charAt(i)==']' && c!='['))
                {
                    return false;
                }
            }
        }
      }
      if(!s1.isEmpty())
        return false;
    else
        return true;
    }
}