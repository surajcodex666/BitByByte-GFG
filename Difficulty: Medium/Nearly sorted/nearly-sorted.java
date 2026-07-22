class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int n = arr.length;
        int index = 0;
        
        for (int i : arr){
            minHeap.offer(i);
            
            if(minHeap.size() > k + 1){ //Every element can be at most k positions away from its correct position.So the smallest element will always be among the next k + 1 elements.
                arr[index++] = minHeap.poll();
            }
        }
        while(!minHeap.isEmpty()){
            arr[index++] = minHeap.poll();
        }
        
    }
}
