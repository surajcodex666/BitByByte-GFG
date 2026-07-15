class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int days) {
        // code here
        int l = maxElement(arr);
        int h = sum(arr);

        while(l <= h){
            int mid = l + (h - l) / 2;

            int noOfDays = daysNeeded(arr, mid);

            if(noOfDays <= days){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
        
    }

    private int sum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    private int maxElement(ArrayList<Integer> arr){
        int maxi = arr.get(0);
        for(int j : arr){
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }

    private int daysNeeded(ArrayList<Integer> arr, int capacity){
        int day = 1, load = 0;
        for(int i : arr){
            if(load + i > capacity){
                day++;
                load = i;
            }
            else{
                load += i;
            }
        }
        return day;
    }
}
    