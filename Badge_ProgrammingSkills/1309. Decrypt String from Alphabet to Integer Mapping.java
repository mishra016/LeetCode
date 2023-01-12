class Solution {
    public String freqAlphabets(String s) {
        //char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                int var = Integer.parseInt(s.substring(i-2, i));
                sb.append((char)(var+'a'-1));
                i = i-2;
            }else{
                sb.append((char)(s.charAt(i)+'0'));
            }
        }
        sb.reverse();
        return new String(sb);
    }
}