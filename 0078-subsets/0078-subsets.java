class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void solve(int[] nums, int i, List<Integer> temp){

        if(i>= nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]); //include
        solve(nums, i+1, temp);

        temp.remove(temp.size() - 1); //exclude
        solve(nums, i+1, temp);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        solve(nums, 0, temp);

        return result;
        
    }
}