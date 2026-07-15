class Solution {
    int KthMissingElement(int arr[], int k) {

        int n = arr.length;

        int totalMissing = arr[n - 1] - (arr[0] + n - 1);

        if (k > totalMissing)
            return -1;

        int l = 0, h = n - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            int missing = arr[mid] - (arr[0] + mid);

            if (missing < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return arr[0] + h + k;
    }
}