class Solution {
    public int subtractProductAndSum(int n) {
        int rem=0,sum=0,mul=1;
        while(n!=0){
            rem = n % 10;
            sum +=rem;
            mul *=rem;      
            n/=10;
        }
        return (mul-sum);
    }
}