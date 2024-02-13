class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         char[] magazineChars = magazine.toCharArray();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            boolean found = false;

            for (int j = 0; j < magazineChars.length; j++) {
                if (magazineChars[j] == c) {
                    magazineChars[j] = '\0'; // Mark the character as used
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}