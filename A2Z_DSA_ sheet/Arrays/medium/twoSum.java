class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();

         for(int i=0; i<nums.length; i++){
            int remaining = target-nums[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }

            map.put(nums[i], i);
         }
         return new int[]{-1,-1};
    }
}




// Interview Explanation — Optimal Approach

// “I’ll solve this problem using a HashMap to achieve O(n) time complexity. I traverse the 
// array once and, for every element, calculate the required value using target - nums[i]. Then
//  I check whether this required value already exists in the HashMap. If it exists, I have found
//   the two numbers whose sum equals the target, so I return their indices. If it doesn’t exist,
//    I store the current number along with its index in the HashMap and continue. This avoids the
//     nested loop used in the brute-force approach and reduces the time complexity from O(n²) to
//      O(n), with O(n) extra space.”