class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2){
            return true;
        }
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        int dx = x2 - x1, dy = y2 - y1;
        for(int[] coordinate: coordinates){
            int x = coordinate[0]; int y = coordinate[1];
            if(dx * (y - y2) != dy * (x - x2)){
                return false;
            }
        }
        
        return true;
    }
}