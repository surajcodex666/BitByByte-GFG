// User function Template for Java

class Solution {

    public static int longestSubarray(int[] arr, int k) {
        // Maps prefix sum -> earliest index it was seen
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        
        // Seed: prefix sum of 0 exists before the array starts (index -1)
        prefixSumMap.put(0L, -1);
        
        long prefixSum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            // If (prefixSum - k) was seen before, we found a valid subarray
            long target = prefixSum - k;
            if (prefixSumMap.containsKey(target)) {
                int length = i - prefixSumMap.get(target);
                maxLength = Math.max(maxLength, length);
            }
            
            // Only store FIRST occurrence to maximize subarray length
            prefixSumMap.putIfAbsent(prefixSum, i);
        }
        
        return maxLength;
    }
}    