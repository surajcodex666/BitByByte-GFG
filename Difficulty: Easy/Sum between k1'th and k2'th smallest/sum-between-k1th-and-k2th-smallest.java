import java.util.*;

class Solution {
    public int sumBetweenK1K2(int[] arr, int k1, int k2) {

        Arrays.sort(arr);

        int sum = 0;

        // Sum elements strictly between k1-th and k2-th smallest
        for (int i = k1; i < k2 - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }
}