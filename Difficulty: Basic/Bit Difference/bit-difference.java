class Solution {
    public static int countBitsFlip(int start, int goal) {
        // code here
        
        int ans = start ^ goal;
        int cnt = 0;
        for(int i = 0; i < 32; i++){
            if((ans & (1 << i)) != 0){
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
}
   