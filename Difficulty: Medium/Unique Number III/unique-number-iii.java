class Solution {
    public int getSingle(int[] nums) {
        // code here
        int n = nums.length;

        int ones = 0, twos = 0;

        for(int i = 0; i < n; i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}
