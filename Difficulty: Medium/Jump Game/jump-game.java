class Solution {
    public boolean canReach(int[] nums) {
        // code here
        int maxIndex = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false; 
            }

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;
    }
}