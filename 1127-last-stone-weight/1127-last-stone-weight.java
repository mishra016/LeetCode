class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int s: stones){
            pq.offer(s);
        }

        while(!pq.isEmpty()){
            int first = pq.poll();

            if(pq.isEmpty()){ //if one stone
                return first;
            }

            int second = pq.poll();

            int balance = Math.abs(first - second);

            if(balance != 0){
                pq.offer(balance);
            }
            
        }

        return 0;
        
    }
}