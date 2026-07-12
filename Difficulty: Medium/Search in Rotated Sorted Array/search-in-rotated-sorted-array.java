class Solution {
    int search(int[] nums, int target) {
        // code here
        
        int n = nums.length;
        int l = 0, h = n - 1;

        while(l <= h){

            int mid = l + (h - l)/2;
            if(nums[mid] == target){
                return mid;
            }

            //left sorted
            else if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target <= nums[mid]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            //right sorted
            else{
                if(nums[mid] <= target && target <= nums[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
   