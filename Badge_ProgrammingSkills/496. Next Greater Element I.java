class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
int[] currIdx = new int[nums1.length];
        int [] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    currIdx[i] = j;
                }
            }
        }
        for(int i=0; i<nums1.length; i++){
            for(int j= currIdx[i]+1; j<nums2.length; j++){
                if(nums2[j] > nums2[currIdx[i]]){
                    ans[i] = nums2[j];
                    break;
                }
            }
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans; 
    }
}