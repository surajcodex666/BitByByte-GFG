class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        long l = maxi(arr), h = sum(arr);
        
        if(k > arr.length){
            return -1;
        }
        
        while(l <= h){
            long mid = l + (h - l) / 2;
            
            int noOfStudents = noOfStudentsWithPages(arr, mid);
            if(noOfStudents > k){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return (int) l;
    }
    
    private long sum(int[] arr){
        
        long sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    
    private int maxi(int[] arr){
        
        int max = arr[0];
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
    
    private int noOfStudentsWithPages(int[] arr,long pages){
        int student = 1, pagesHeHas = 0;
        
        for(int i : arr){
            if(pagesHeHas + i <= pages){ //here pages is gonna be the mid value
                pagesHeHas += i;
            }
            else{
                student++;
                pagesHeHas = i; //if the no of pages exceedes the move further and do student++ and assign that page to the nxt student
            }
        }
        return student;
    }
}