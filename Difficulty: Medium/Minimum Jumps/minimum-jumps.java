class Solution {
    public int minJumps(int[] nums) {
        // code here
        int n = nums.length;
        if(n <= 1){
            return 0;
        }
        int jumps = 0;
        int l = 0 , r = 0;

        while(r < n - 1){
            int farthest = 0;
            for(int index = l; index <= r; index++){
                farthest = Math.max(index + nums[index] , farthest);
            }
            if(farthest == r){
                return -1;
            }
            l = r + 1;
            r = farthest;
            jumps = jumps + 1;
        }
        return jumps;
    }
}