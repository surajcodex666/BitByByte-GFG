class Solution {
    public int maxConsecBits(int[] nums) {
        // code here
        int n = nums.length;
        int maxi = 0;
        int zero = 0,  one = 0;
       
        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                one++;
                zero = 0;
                
                
            }
            else if(nums[i] == 0){
                zero++;
                one = 0;
                
            }
            maxi = Math.max(maxi, Math.max(one, zero));
        }
        return maxi;

    }
}
