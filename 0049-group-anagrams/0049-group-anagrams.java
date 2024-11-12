public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store lists of anagrams. The key is the sorted string,
        // and the value is a list of strings that are anagrams of each other.
        //TC: O(m * n logn)
        //SC: O(m*n)
        Map<String, List<String>> res = new HashMap<>();
        
        // Loop through each string in the input array
        for (String s : strs) {
            // Convert the string into a character array
            char[] charArray = s.toCharArray();
            
            // Sort the character array to create a "canonical" version of the string
            Arrays.sort(charArray);
            
            // Convert the sorted character array back into a string
            String sortedS = new String(charArray);
            
            // If the sorted string is not already a key in the map, add it with a new ArrayList
            res.putIfAbsent(sortedS, new ArrayList<>());
            
            // Add the original string to the list of anagrams for the sorted key
            res.get(sortedS).add(s);
        }
        
        // Return a list of all the grouped anagrams (the values of the map)
        return new ArrayList<>(res.values());
    }
}
