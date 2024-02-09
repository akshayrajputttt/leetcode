class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Iterate through characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            // Check if character matches in the second and third strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // If not, return substring up to previous index
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If no mismatches found, return the first string as the longest common prefix
        return strs[0]; 
    }
}