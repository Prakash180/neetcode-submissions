class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums){
            freqMap.merge(i, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,Integer> a : freqMap.entrySet()){
            pq.offer(a);
            if(pq.size()>k)
                pq.poll();
        }

        int[] res=new int[k]; 
        for(int i=0;i<k;i++){
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}
