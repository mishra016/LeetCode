class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            char ch=operations[i].charAt(1);
            if(ch=='+')
                x++;
            else
                x--;
        }
        return x;
    }
}