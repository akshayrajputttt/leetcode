class Solution {
    public int sumOfUnique(int[] nums) {
         int sum = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;

            // Check if the current element appears elsewhere in the array
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, add it to the sum
            if (isUnique) {
                sum += nums[i];
            }
        }

        return sum;
    }
}