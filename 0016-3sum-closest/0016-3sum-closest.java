class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    int currentDiff = Math.abs(currentSum - target);

                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                        closestSum = currentSum;
                    }
                }
            }
        }

        return closestSum;
    }
}