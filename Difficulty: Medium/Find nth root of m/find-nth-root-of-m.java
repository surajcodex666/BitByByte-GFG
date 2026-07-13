class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        int l = 1, h = m;
        
        if(m == 0) return 0;
        
        while(l <= h){
            
            int mid = l + (h - l)/2;
            
            long ans = 1;
            for(int i = 0; i<n; i++){
                ans *= mid;
                if(ans > m){
                    break;
                }
            }
            
            if(ans == m){
                return mid;
            }
            else if(ans > m){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
}