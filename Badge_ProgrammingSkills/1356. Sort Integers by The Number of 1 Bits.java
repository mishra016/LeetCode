class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] asc = new Integer[arr.length];
        Arrays.setAll(asc, i -> arr[i]);
        Arrays.sort(asc, Comparator.comparingInt(Integer::bitCount).
                            thenComparing(Comparator.naturalOrder()));
        Arrays.setAll(arr, i -> asc[i]);
        return arr;
    }
}