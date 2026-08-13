class Solution {
    double power(double x, int n) {
        // code here
        long m = n;
        double ans = 1;

        if(m < 0){
            m = -m;
        }
        while(m > 0){
            if(m % 2 == 1){
                ans = ans * x;
                m = m - 1;
            }
            else{
                m = m / 2;
                x *= x;
                
            }
            
            
        }
        if(n < 0){
            ans = 1.0 / ans;
        }
        return ans;
    }
}
   