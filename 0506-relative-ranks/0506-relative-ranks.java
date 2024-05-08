class Solution {
    public String[] findRelativeRanks(int[] score) {
        int N = score.length;
        int[] scoreCopy = new int[N];
        System.arraycopy(score, 0, scoreCopy, 0, N);

        Map<Integer, Integer> scoreMap = new HashMap<>();

        for(int i=0; i<N; i++){
            scoreMap.put(scoreCopy[i], i);
        }

        Arrays.sort(scoreCopy);

        //Assign ranks
        //Travers in reverse
        String[] rank = new String[N];

        for(int i=0; i<N; i++){
            if (i == 0) {
                rank[scoreMap.get(scoreCopy[N - i - 1])] = "Gold Medal";
            } else if (i == 1) {
                rank[scoreMap.get(scoreCopy[N - i - 1])] = "Silver Medal";
            } else if (i == 2) {
                rank[scoreMap.get(scoreCopy[N - i - 1])] = "Bronze Medal";
            } else {
                rank[scoreMap.get(scoreCopy[N - i - 1])] = Integer.toString(i + 1);
            }

        }

        return rank;
        
    }
}