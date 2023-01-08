class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] alpha = new int[26];
        for (char c: magazine.toCharArray()) {
            alpha[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (alpha[c - 'a'] == 0) {
                return false;
            }else{
                alpha[c-'a']--;
            }
        }
        return true;
    }
}