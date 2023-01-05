class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int n= salary.length;
        //int total = salary.length-2;
        for(int i=1; i<salary.length-1;i++){
            sum = sum + salary[i];
        }
        return sum/(n-2);
    }
}
//{
            // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // double sum=0;
        // int n= salary.length;

        // for(int i =0; i<salary.length; i++){
        //     max = Math.max(salary[i],max);
        //     min = Math.min(salary[i],min);

        //     sum += salary[i];
        // }

        // sum = sum - max - min;
        // return sum/(n-2);
//}