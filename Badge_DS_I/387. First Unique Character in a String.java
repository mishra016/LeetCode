class Solution {
    public int firstUniqChar(String s) {
        int[] alphabets = new int[26];
        for(char c: s.toCharArray()){
            alphabets[c-(int)'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char v = s.charAt(i);
            if(alphabets[v - (int)'a'] == 1){
                return i;
            }
        }
       return -1;
        
    }
}