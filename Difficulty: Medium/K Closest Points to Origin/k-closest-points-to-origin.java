class Pair{

    int dist;
    int x;
    int y;

    Pair(int dist,int x,int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<Pair> maxHeap =
        new PriorityQueue<>(
        (a,b)->b.dist-a.dist);

        for(int[] point:points){

            int x=point[0];
            int y=point[1];

            int dist=x*x+y*y;

            maxHeap.offer(new Pair(dist,x,y));

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while(!maxHeap.isEmpty()){

            Pair p=maxHeap.poll();

            ArrayList<Integer> point = new ArrayList<>();

            point.add(p.x);
            point.add(p.y);
        
            ans.add(point);
        }

        return ans;
    }
}