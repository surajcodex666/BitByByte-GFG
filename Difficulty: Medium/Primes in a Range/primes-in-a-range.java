class Solution {
    public ArrayList<Integer> primeRange(int l, int r) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            if (isPrime(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}