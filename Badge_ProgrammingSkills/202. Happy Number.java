class Solution {
    public boolean isHappy(int n) {
        int var = 0;
        while(n>0){
            int digit = n%10;
            var += digit*digit;
            n = n/10;
        }
        if(var == 1){
            return true;
        }else if(var == 4){
            return false;
        }
        return isHappy(var);
    }
}