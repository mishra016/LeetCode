class Solution {
    public String addBinary(String a, String b) {
        StringBuilder binary = new StringBuilder();
        int carry =0; 
        int length1 = a.length()-1;
        int length2 = b.length()-1;
        while(length1>= 0 || length2>=0 || carry== 1){
            if(length1 >=0){
                carry += a.charAt(length1--) - '0';
            }
            if(length2 >=0){
                carry += b.charAt(length2--) - '0';
            }
            binary.append(carry % 2);
            carry /=2;

        }
        return binary.reverse().toString();
        
    }
}