class Solution {
    public void reverseString(char[] s) {
        int pt1=0, pt2=s.length;
        while(pt1<pt2){
            char temp = s[pt1];
            s[pt1] = s[pt2-1];
            s[pt2-1] = temp;
            pt1++;
            pt2--;
        }
    }
}