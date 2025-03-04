import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> characterSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!characterSet.contains(s.charAt(right))) {
                characterSet.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                while (characterSet.contains(s.charAt(right))) {
                    characterSet.remove(s.charAt(left));
                    left++;
                }
                characterSet.add(s.charAt(right));
            }

        }

        return max;
    }
}