class Solution {
    public int minTime(int[] boards, int k) {
        // code here
        long low = maxBoardLength(boards);
        long high = totalBoardLength(boards);

        while (low <= high) {

            long mid = low + (high - low) / 2;

            int paintersRequired = countPainters(boards, mid);

            if (paintersRequired > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) low;
    }

    private long totalBoardLength(int[] boards) {

        long sum = 0;

        for (int board : boards) {
            sum += board;
        }

        return sum;
    }

    private int maxBoardLength(int[] boards) {

        int max = boards[0];

        for (int board : boards) {
            max = Math.max(max, board);
        }

        return max;
    }

    private int countPainters(int[] boards, long maxLengthPerPainter) {

        int painters = 1;
        long currentLength = 0;

        for (int board : boards) {

            if (currentLength + board <= maxLengthPerPainter) {
                currentLength += board;
            } else {
                painters++;
                currentLength = board;
            }
        }

        return painters;
    }
}