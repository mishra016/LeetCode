class Solution {
    public int appendCharacters(String s, String t) {

        int startS = 0, startT = 0;

        while(startS < s.length() && startT < t.length()){
            if(s.charAt(startS) == t.charAt(startT)){
                startT++;
            }
            startS++;
        }

        return t.length() - startT;
        
    }
}