class Solution {
    public double minMaxDist(int[] arr, int k) {
        
        if (arr.length <= 1) {
        return 0.0;
        }
        // code here
        int n = arr.length;
        int[] howMany = new int[n - 1]; // Number of gas stations in each segment

        // Place each gas station
        for (int gasStations = 1; gasStations <= k; gasStations++) {
            double maxSection = -1;
            int maxInd = -1;

            // Find the segment with the maximum distance
            for (int i = 0; i < n - 1; i++) {
                double diff = arr[i + 1] - arr[i];
                double sectionLength = diff / (howMany[i] + 1.0);

                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxInd = i;
                }
            }

            // Add gas station to the selected segment
            howMany[maxInd]++;
        }

        // Find the final max section length after placing all gas stations
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (howMany[i] + 1.0);
            maxAns = Math.max(maxAns, sectionLength);
        }

        return maxAns;
    }
}
