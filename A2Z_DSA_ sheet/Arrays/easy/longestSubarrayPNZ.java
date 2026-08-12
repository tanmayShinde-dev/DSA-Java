//brute force

class LongestSubarray {

    public static int longestSubarray(int[] nums, int k) {

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum == k) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }
}
                                                                                    

// optimal only for positive elm arr

class longestSubarray {

    public int longestSubarray(int[] nums, int k) {

        int n = nums.length;

        int left = 0;
        int right = 0;

        int sum = nums[0];
        int maxLen = 0;

        while (right < n) {

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;

            if (right < n) {
                sum += nums[right];
            }
        }

        return maxLen;
    }
}






// for pos neg and zero elm arrays

/*

|  i | nums[i] | `sum` | `remaining = sum-k` | Map before check                 | Found?     |  Length | `maxLength` |
| -: | ------: | ----: | ------------------: | -------------------------------- | ---------- | ------: | ----------: |
|  0 |      10 |    10 |                  -5 | `{}`                             | ❌          |       — |           0 |
|  1 |       5 |    15 |                   0 | `{10→0}`                         | — `sum==k` |       2 |       **2** |
|  2 |       2 |    17 |                   2 | `{10→0, 15→1}`                   | ❌          |       — |           2 |
|  3 |       7 |    24 |                   9 | `{10→0, 15→1, 17→2}`             | ❌          |       — |           2 |
|  4 |       1 |    25 |                  10 | `{10→0, 15→1, 17→2, 24→3}`       | ✅ `10→0`   | `4-0=4` |       **4** |
|  5 |       9 |    34 |                  19 | `{10→0, 15→1, 17→2, 24→3, 25→4}` | ❌          |       — |           4 |

*/

import java.util.HashMap;

public static int longestSubarrayPNZ(int nums[], int k){

    HashMap<Integer, Integer> map = new HashMap<>();

    int sum =0;
    int maxLength = 0;

    for(int i=0; i<nums.length; i++){
        sum+= nums[i];

        if(k==sum){
            maxLength = i + 1;
        }

        int remaining = sum-k;

        if(map.containsKey(remaining)){
            length = i - map.get(remaining);
            maxLength = Math.max(length, maxLength);
        }

        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
    }

    return maxLength;
}


// I use a prefix sum and HashMap approach to find the longest subarray whose sum is equal to k. I maintain a 
// running sum while traversing the array and store each prefix sum with its first occurring index in the HashMap. 
// For every index, I calculate remaining = sum - k, because if a previous prefix sum equal to sum - k exists, then 
// the difference between the current sum and that previous sum is exactly k, meaning the elements between those two 
// positions form a valid subarray. I then calculate its length using i - map.get(remaining) and update maxLength if this length is larger.
//  I also check sum == k separately because in that case the valid subarray starts from index 0. I store only the first occurrence of a 
//  prefix sum because an earlier index gives a longer subarray. This approach works with positive, negative, and zero values. The time 
//  complexity is O(n) on average because we traverse the array once and HashMap operations take O(1) average time, while the space complexity
//   is O(n) because the HashMap can store up to n prefix sums.