//brute force
class LongestSubarray {

    public static int longestSubarray(int[] nums) {

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum == 0) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }
}


// optimal

import java.util.HashMap;

public static int longestSubarrayPNZ(int nums[]) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int k = 0;
    int sum = 0;
    int maxLength = 0;

    for (int i = 0; i < nums.length; i++) {

        sum += nums[i];

        if (k == sum) {
            maxLength = i + 1;
        }

        int remaining = sum - k;

        if (map.containsKey(remaining)) {
            int length = i - map.get(remaining);
            maxLength = Math.max(length, maxLength);
        }

        if (!map.containsKey(sum)) {
            map.put(sum, i);
        }
    }

    return maxLength;
}