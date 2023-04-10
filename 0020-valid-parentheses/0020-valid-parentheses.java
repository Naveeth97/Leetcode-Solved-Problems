class Solution {
    public boolean isValid(String s) {
       int i = -1;
       boolean bol = false;
       char paren[] = new char[s.length()];
       for(char ch : s.toCharArray()){
            if(ch=='{' || ch == '(' || ch == '['){
                paren[++i] = ch;
            }
            else{
                if(i>=0 && ((paren[i] =='[' && ch == ']') || (paren[i] == '(' && ch == ')') || (paren[i] == '{' && ch == '}'))){
                    --i;
                }
                else{
                    return false;
                }
            }
       }
       if(i==-1){
           bol = true;
       }
       return bol;
       
    }
}