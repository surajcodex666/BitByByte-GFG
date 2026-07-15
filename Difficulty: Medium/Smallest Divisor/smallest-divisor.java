class Solution {
    int smallestDivisor(int[] nums, int threshold) {
        // Code here
        int n = nums.length;

        int l = 1, h = maxElement(nums);
        int ans = -1;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(sumOfDivision(nums, mid) <= threshold){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
        
    }

    private int maxElement(int[] nums){
        int maxi = nums[0];
        for(int i : nums){
            maxi = Math.max(maxi, i);
        }
        return maxi;
    }

    private int sumOfDivision(int[] nums, int divisor){
        int sum = 0;
        int n = nums.length;

        for(int j : nums){
            sum += (j + divisor - 1)/divisor;
        }
        return sum;
    }
}
