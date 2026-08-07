class Solution {
    public static int countDigits(int n) {
        // Code here
        int cnt = 0;
        while(n > 0){
            int digits = n % 10;
            if(n != 0){
                cnt++;
            }
            n = n / 10;
        }
        return cnt;
    }
}
