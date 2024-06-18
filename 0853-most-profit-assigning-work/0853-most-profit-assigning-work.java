class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int total = 0;

        for(int j=0; j<worker.length; j++){
            int max =0; 

            for(int i=0; i<difficulty.length; i++){
                if(difficulty[i] <= worker[j]){
                    max = Math.max(max, profit[i]);
                }
            }

            total = total + max;
        }
        
        return total;

    }
}