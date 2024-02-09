class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        // Check for numbers in nums1 that are not in nums2
        for (int i = 0; i < nums1.length; i++) {
            boolean foundInNums2 = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    foundInNums2 = true;
                    break;
                }
            }
            if (!foundInNums2) {
                if (!diff1.contains(nums1[i])) {
                    diff1.add(nums1[i]);
                }
            }
        }

        // Check for numbers in nums2 that are not in nums1
        for (int i = 0; i < nums2.length; i++) {
            boolean foundInNums1 = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    foundInNums1 = true;
                    break;
                }
            }
            if (!foundInNums1) {
                if (!diff2.contains(nums2[i])) {
                    diff2.add(nums2[i]);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);

        return result;

    }}