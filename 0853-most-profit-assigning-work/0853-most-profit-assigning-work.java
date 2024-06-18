class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int m = difficulty.length; 
        int n = worker.length;

        //intialize max heap(priority queue)

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]); //by profit

        for(int i=0; i<m; i++){
            int diff = difficulty[i];
            int prof = profit[i];

            pq.offer(new int[]{prof, diff});
        }

        //sort worker in desc

        Arrays.sort(worker);
        for(int i=0; i<n/2; i++){
            int temp = worker[i];
            worker[i] = worker[n-1-i];
            worker[n-1-i] = temp;
        }

        int i =0;
        int total =0;

        //while there are workers left and there are jobs available in the pq
        while(i<n && !pq.isEmpty()){
            if(pq.peek()[1] > worker[i]){
                pq.poll();
            }
            else{
                total += pq.peek()[0];
                i++;
            }
        }

        return total;
    }
}






// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

//         int total = 0;

//         for(int j=0; j<worker.length; j++){
//             int max =0; 

//             for(int i=0; i<difficulty.length; i++){
//                 if(difficulty[i] <= worker[j]){
//                     max = Math.max(max, profit[i]);
//                 }
//             }

//             total = total + max;
//         }
        
//         return total;

//     }
// }