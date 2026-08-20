class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        if(n<2){
            return -1;
        }
        
        int largest = arr[0];
        int sec_largest = -1;
        
        for( int i = 0; i<n; i++){
            if(arr[i]> largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sec_largest && arr[i] != largest){
                sec_largest = arr[i];
            }
        }
        return sec_largest;
    }
}