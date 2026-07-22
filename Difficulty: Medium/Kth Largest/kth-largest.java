class Solution {
    public static int kthLargest(int nums[], int k) {
        // code here
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int x : nums){

            minHeap.offer(x);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
    