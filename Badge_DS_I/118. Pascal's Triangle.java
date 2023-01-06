class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    list.add(left+right);
                }
            }
            result.add(list);
        }
        return result;
    }
}