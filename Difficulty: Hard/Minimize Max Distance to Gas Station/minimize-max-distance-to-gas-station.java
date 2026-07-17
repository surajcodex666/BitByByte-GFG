class Solution {

    public double minMaxDist(int[] arr, int K) {

        double low = 0;
        double high = arr[arr.length - 1] - arr[0];

        while (high - low > 1e-6) {

            double mid = low + (high - low) / 2;

            if (canPlace(arr, K, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

    private boolean canPlace(int[] arr, int K, double dist) {

        int requiredStations = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            double gap = arr[i + 1] - arr[i];

            requiredStations += (int)(gap / dist);

            if (gap == ((int)(gap / dist)) * dist) {
                requiredStations--;
            }
        }

        return requiredStations <= K;
    }
}