class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int ans = n;
        
        int l = 0, h = n - 1;
        
        
        while(l <= h){
            
            int mid = l + (h - l)/2;
            
            if(arr[mid] >= k){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
            
        }
        
        //check if k exists or not
        if(ans == n || arr[ans] != k){
            return -1;
        }
        
        return ans;
    }
}