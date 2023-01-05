class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int minDist = Integer.MAX_VALUE;
        for(int i=0; i<points.length; i++){
            int dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
            if(points[i][0] == x || points[i][1] == y){
                if(minDist > dist){
                    minDist = dist;
                    index = i;
                }
            } 
        }
        return index;
    }
}