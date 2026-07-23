class Pair{

    int value;
    int freq;

    Pair(int value,int freq){
        this.value=value;
        this.freq=freq;
    }
}

class Solution {

    public ArrayList<Integer> sortByFreq(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair> maxHeap =
        new PriorityQueue<>(
        (a,b)->{

            if(a.freq==b.freq)
                return a.value-b.value;

            return b.freq-a.freq;
        });

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            maxHeap.offer(
                new Pair(entry.getKey(),entry.getValue())
            );
        }

        ArrayList<Integer> ans=new ArrayList<>();

        while(!maxHeap.isEmpty()){

            Pair p=maxHeap.poll();

            for(int i=0;i<p.freq;i++){
                ans.add(p.value);
            }
        }

        return ans;
    }
}