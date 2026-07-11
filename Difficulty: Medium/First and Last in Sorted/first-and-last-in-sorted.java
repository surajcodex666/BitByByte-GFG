class Solution {
    ArrayList<Integer> find(int nums[], int target) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = nums.length;

        int lb = lb(nums, n, target);

        if (lb == n || nums[lb] != target) {
            list.add(-1);
            list.add(-1);
            return list;
        }
        int ub = ub(nums, n, target);
        list.add(lb);
        list.add(ub - 1);
        
        return list;
    }

    public int lb(int[] nums, int n, int target) {

        n = nums.length;

        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int ub(int[] nums, int n, int target) {

        n = nums.length;

        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
   