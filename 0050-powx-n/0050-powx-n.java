class Solution {
    public double myPow(double x, int n) {
        /*
        int i=0;
        double res  = 1D;
        if(n<0){
            n=-n;
            x = 1/x;
        }
        
        while(i<n){
            res*=x;
            i++;
        }
        return res;
        */

        
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;   
    }
}