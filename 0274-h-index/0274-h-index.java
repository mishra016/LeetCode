class Solution {
    public int hIndex(int[] citations) {
        int high = citations.length, low = 0;
        while(low<high){
            int mid= (low+high+1)/2;
            int count=0;
            for(int i=0; i<citations.length; i++){
                if(citations[i] >= mid){
                    count++;
                }
            }
            if(count >=mid){
                low = mid;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}