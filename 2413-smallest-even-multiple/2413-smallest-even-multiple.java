class Solution {
    public int smallestEvenMultiple(int n) {
        int odd;
        if(n%2!=0){
            odd = 2 * n;
            return odd;
        }
        else return n;
    }
}