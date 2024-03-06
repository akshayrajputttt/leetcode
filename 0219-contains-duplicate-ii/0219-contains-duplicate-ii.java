class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         if (k <= 0) {
            return false;
        }

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Check for duplicates within the window of size k
            for (int j = i + 1; j < n && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    }