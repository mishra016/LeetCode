class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();

        int start1 = 0; 
        int start2 = 0;

        while(start1<nums1.length && start2<nums2.length){
            if(nums1[start1] < nums2[start2]){
                start1++;
            }
            else if(nums1[start1] > nums2[start2]){
                start2++;
            }
            else{
                arr.add(nums1[start1]);
                start1++;
                start2++;
            }
        }

        int[] ans = new int[arr.size()];

        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}