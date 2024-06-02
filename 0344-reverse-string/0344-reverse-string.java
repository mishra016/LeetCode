class Solution {
    public void reverseString(char[] s) {

        int start = 0, end = s.length;

        while(start < end){
            char temp = s[start];
            s[start] = s[end - 1];
            s[end - 1] = temp;

            start++;
            end--;
        }
        
    }
}