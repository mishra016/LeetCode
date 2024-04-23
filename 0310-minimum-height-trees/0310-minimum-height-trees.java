class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if(n == 1){
            return Collections.singletonList(0);
        }

        List<Integer> result = new ArrayList<>();
        int[] degree = new int[n];
        Map<Integer, List<Integer>> neighbors = new HashMap<>();

        //Build Graph
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            degree[u]++;
            degree[v]++;

            neighbors.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            neighbors.computeIfAbsent(v, k -> new ArrayList<>()).add(u);

        }

        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(degree[i] == 1){ //add all the leaf nodes
                que.add(i);
            }
        }

        while(n>2){
            int size = que.size();
            n = n-size;

            while(size-- > 0){
                int u = que.poll();

                for(int v: neighbors.getOrDefault(u, Collections.emptyList())){
                    degree[v]--;

                    if(degree[v] == 1){
                        que.add(v);
                    }
                }
            }
        }
        
        while(!que.isEmpty()){
            result.add(que.poll());
        }

        return result;
        
    }
}