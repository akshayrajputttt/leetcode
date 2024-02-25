class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int length = flowerbed.length;
        int count = 0;

        for (int i = 0; i < length && count < n; i += 2) {
            if (flowerbed[i] == 0) {
                if (i == length - 1 || flowerbed[i + 1] == 0) {
                    count++;
                } else {
                    i++;  // Skip the next plot as it's occupied
                }
            }
        }

        return count >= n;
    }
    }
    