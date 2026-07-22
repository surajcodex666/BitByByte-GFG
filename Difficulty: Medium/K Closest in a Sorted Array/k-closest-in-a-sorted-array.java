class Pair {
    int diff;
    int value;

    Pair(int diff, int value) {
        this.diff = diff;
        this.value = value;
    }
}

class Solution {

    int[] printKClosest(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.diff != b.diff)
                    return b.diff - a.diff;

                return a.value - b.value;
            });

        for (int num : arr) {

            if (num == x) continue;

            pq.offer(new Pair(Math.abs(num - x), num));

            if (pq.size() > k)
                pq.poll();
        }

        List<Pair> list = new ArrayList<>();

        while (!pq.isEmpty())
            list.add(pq.poll());

        list.sort((a, b) -> {
            if (a.diff != b.diff)
                return a.diff - b.diff;

            return b.value - a.value;
        });

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = list.get(i).value;

        return ans;
    }
}