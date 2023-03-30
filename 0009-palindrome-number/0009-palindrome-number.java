class Solution {
    public boolean isPalindrome(int x) {
        int rem,res=0;
        int rev = x;
        while(x>0){
            rem = x %10;
            res = (res*10) + rem;
            x/=10;
        }
        if(res == rev){
            return true;
        }
        else return false;
    }
}