class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int nums[]) {
        // code here
        int n = nums.length;

        // Calculate the total number of subsets (2^n)
        int subsets = 1 << n;

        // List to store all subsets
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int num = 0; num < subsets; num++) {

            ArrayList<Integer> subset = new ArrayList<>();

            // Iterate through each bit of the number
            for (int i = 0; i < n; i++) {
                // If ith bit is set, include nums[i] in the subset
                if ((num & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

            ans.add(subset);
        }

        return ans;
    }
}
   