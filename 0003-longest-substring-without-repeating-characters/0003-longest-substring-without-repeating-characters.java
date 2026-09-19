class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int[] lastSeen = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            left = Math.max(left, lastSeen[curr]);

            maxLength = Math.max(maxLength, right - left + 1);

            lastSeen[curr] = right + 1;
        }

        return maxLength;
    }
}