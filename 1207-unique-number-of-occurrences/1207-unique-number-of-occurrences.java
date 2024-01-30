class Solution {
    public boolean uniqueOccurrences(int[] arr) {
                HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the counts are unique
        HashSet<Integer> uniqueCounts = new HashSet<>(countMap.values());
        return uniqueCounts.size() == countMap.size();

    }
}