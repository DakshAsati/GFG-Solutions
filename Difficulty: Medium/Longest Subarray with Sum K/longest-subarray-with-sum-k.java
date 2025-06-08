import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int k) {
        // Map to store the first occurrence of each prefix sum
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: Whole array (from index 0) sums to k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: There is a previous prefix sum that makes this subarray sum to k
            if (prefixMap.containsKey(sum - k)) {
                int prevIndex = prefixMap.get(sum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Only store the first occurrence of each prefix sum
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
