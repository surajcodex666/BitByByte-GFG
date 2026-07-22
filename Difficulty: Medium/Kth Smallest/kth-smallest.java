class Solution {
    public int kthSmallest(int[] nums, int k) {
        // Code here
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : nums){

            maxHeap.offer(x);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
    
