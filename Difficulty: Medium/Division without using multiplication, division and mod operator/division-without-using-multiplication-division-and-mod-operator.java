class Solution {
    public int divide(int dividend, int divisor) {
        // code here
        

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {

            int count = 0;

            while (n >= (d << (count + 1))) {
                count++;
            }

            ans += 1L << count;
            n -= d << count;
        }

        if ((dividend < 0) ^ (divisor < 0))
            ans = -ans;

        return (int) ans;
    }
}
