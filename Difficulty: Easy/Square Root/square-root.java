class Solution {
    int floorSqrt(int x) {
        // code here

        if(x == 0 || x == 1){
            return x;
        }

        int l = 1, h = x;
        int ans = 1;

        while(l <= h){
            int mid = l + (h - l)/2;

            long square = (long) mid * mid;

            if(square <= x){
                
                ans = mid;
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return ans;
    }
}
