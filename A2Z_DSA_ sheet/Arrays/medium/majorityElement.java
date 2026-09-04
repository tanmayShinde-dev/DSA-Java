class majorityElement {
    public int majorityElement(int[] nums) {

        int el = 0;
        int ct = 0;

        // Step 1: Find candidate
        for (int i = 0; i < nums.length; i++) {

            if (ct == 0) {
                el = nums[i];
                ct++;
            }
            else if (el == nums[i]) {
                ct++;
            }
            else {
                ct--;
            }
        }

        // Step 2: Verify candidate
        int ct1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                ct1++;
            }
        }

        if (ct1 > nums.length / 2) {
            return el;
        }

        return -1;
    }
}


// In this approach, I use Moore's Voting Algorithm in two steps because a majority
//  element is not guaranteed to exist. In the first step, I find a potential candidate
//   using `el` and `ct`. If the count becomes `0`, I choose the current element as the 
//   candidate. If the current element is the same as the candidate, I increase the count;
//    otherwise, I decrease it because one candidate and one different element cancel each
//     other. In the second step, I count the actual occurrences of the candidate using `ct1`.
//      If its count is greater than `n/2`, I return `el`; otherwise, I return `-1`. The time 
//      complexity is `O(n)` because we traverse the array twice, and the space complexity is 
//      `O(1)` because we only use a few variables.



// if maj el exist step 1 is enough if not need to check twice with step 2