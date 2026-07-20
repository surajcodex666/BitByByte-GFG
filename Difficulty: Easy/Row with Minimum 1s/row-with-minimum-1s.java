class Solution {
    int minRow(int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        int minOnes = Integer.MAX_VALUE;
        int ans = 1; // 1-based indexing

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    count++;
            }

            if (count < minOnes) {
                minOnes = count;
                ans = i + 1; // Convert to 1-based index
            }
        }

        return ans;
    }
}