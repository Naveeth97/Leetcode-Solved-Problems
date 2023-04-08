class Solution {
    int number(char ch){
            if(ch=='I') return 1;
            if(ch=='V') return 5;
            if(ch=='X') return 10;
            if(ch=='L') return 50;
            if(ch=='C') return 100;
            if(ch=='D') return 500;
            if(ch=='M') return 1000;
            return 0;

        }
    public int romanToInt(String s) {
        
        int answer=0;
        for(int i=0;i<s.length();i++){
            int a1 = number(s.charAt(i));
            if(i + 1<s.length()){
                int a2 = number(s.charAt(i+1));
                if(a1>=a2){
                    answer+=a1;
                }
                else{ 
                    answer+=a2 - a1;
                    i++;
                }
            }
            else{
                answer+=a1;
            }
        }
        return answer;
    }
}