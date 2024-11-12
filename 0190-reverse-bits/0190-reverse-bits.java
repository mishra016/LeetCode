public class Solution {
    public int reverseBits(int n) {
        StringBuilder binary = new StringBuilder();
        
        // Convert `n` to binary string representation by checking each bit using modulo
        for (int i = 0; i < 32; i++) {
            // Check if the least significant bit is 1
            if ((n & (1 << i)) != 0) {
                binary.append("1");
            } else {
                binary.append("0");
            }

        }
        
        int res = 0;
        String reversedBinary = binary.reverse().toString();
        
        // Reconstruct the reversed integer using powers of 2 (instead of bitwise OR)
        for (int i = 0; i < 32; i++) {
            if (reversedBinary.charAt(i) == '1') {
                // Using Math.pow(2, i) to add the value at the i-th position
                res |= (1 << i);
            }
        }
        
        return res;
    }
}
