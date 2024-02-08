class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g); // Sort children's greed factor array
        Arrays.sort(s); // Sort cookies' size array
        int contentChildren = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                contentChildren++;
                i++; // Move to the next child
            }
            j++; // Move to the next cookie
        }
        return contentChildren;
    }
    }