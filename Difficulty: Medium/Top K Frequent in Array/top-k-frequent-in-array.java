class Pair {
    int value;
    int freq;

    Pair(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
}
class Solution {
    public ArrayList<Integer> topKFreq(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.freq == b.freq)
                    return a.value - b.value;

                return a.freq - b.freq;
            });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            minHeap.offer(new Pair(entry.getKey(), entry.getValue()));

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            ans.add(minHeap.poll().value);
        }
        
        Collections.reverse(ans);

        return ans;
    }
}
