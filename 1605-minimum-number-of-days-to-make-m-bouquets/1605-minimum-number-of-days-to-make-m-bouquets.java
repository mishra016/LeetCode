class Solution {
    int canMakeBouquet(int[] bloomDay, int mid, int k){
        int bouqCount = 0;
        int adjCount = 0;

        //find count of adj flowers we can pick at midDay
        for(int i=0; i<bloomDay.length; i++){
            //agar ith value <= mid, means flower bloomed 
            if(bloomDay[i] <= mid){
                adjCount++;
            }else{
                adjCount = 0; //reset
            }

            //agar adj flowers == k, means 1 bouq completed,
            if(adjCount == k){
                bouqCount++;
                adjCount = 0; //reset
            }
        }

        return bouqCount;

    }


    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < m*k){
            return -1;
        }

        int startDay = 0;
        int endDay = Arrays.stream(bloomDay).max().getAsInt();
        int minDays = -1;

        while(startDay <= endDay){

            int midDay = startDay + (endDay - startDay) / 2 ; //l+(r-l)/2

            //canMake --> will work on bloomDay, with the wait(mid), 
            //number of adj flowers needed(k)
            if(canMakeBouquet(bloomDay, midDay, k) >= m){ //req bouq ban rahe hai
                minDays = midDay;
                endDay = midDay - 1;
            }else{
                startDay = midDay + 1;
            }
        }

        return minDays;

    }
}