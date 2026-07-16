class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        int l = 0, h = arr[n-1] - arr[0];
        
        while(l <= h){
            int mid = l + (h - l) / 2;
            
            if(canWePlace(arr, mid , k) == true){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return h;
    }
    
    private boolean canWePlace(int[] arr, int d, int k){
        int cntCows = 1;
        int lastCowPlaced = arr[0];
        int n = arr.length; //there cant be more places than this
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] - lastCowPlaced >= d){ //d is the distance we are taking from imaginary array the mid 
                cntCows++;
                lastCowPlaced = arr[i];
            }
            
        }
        if(cntCows >= k){
            return true;
        }
        else {
            return false;
        }        
    }
}