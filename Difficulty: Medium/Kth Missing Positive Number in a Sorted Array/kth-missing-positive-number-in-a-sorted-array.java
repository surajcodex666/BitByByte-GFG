class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here

        int n = arr.length;

        int l = 0, h = n - 1;

        while(l <= h){
            int mid = l + (h - l) / 2;

            int missing = arr[mid] - (mid + 1);
            
            if(missing < k){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return l + k;
        
    }
}
