class Solution {
    public int kokoEat(int[] piles, int h) {
        // code here
        int l = 1, high = findMax(piles);
        int ans = findMax(piles);

        while(l <= high){
            int mid = l + (high - l)/2;

            long totalhr = totalHr(piles, mid);

            if(totalhr <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                l = mid + 1;
            } 
        }
        return ans;
        
    }

    private int findMax(int[] piles){
        int max = piles[0];

        for(int pile : piles){
            if(pile > max){
                max = pile;
            }
        }
        return max;
    }

    private long totalHr(int[] piles, int h){
        long totalhrs = 0;

        for(int banana : piles){
            totalhrs += (banana + h - 1)/h;

        }
        return totalhrs;
    }
}
    
