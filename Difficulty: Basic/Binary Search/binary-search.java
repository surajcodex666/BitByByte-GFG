class Solution {
    public boolean binarySearch(int[] nums, int target) {
        // code here
        int n = nums.length;
        int l = 0, h = n - 1;
        

        while(l <= h){
            
            int mid = l + (h - l)/2;

            if(nums[mid] == target){
                return true;

            }
            else if(target > nums[mid]){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return false;
        
    }
}
    