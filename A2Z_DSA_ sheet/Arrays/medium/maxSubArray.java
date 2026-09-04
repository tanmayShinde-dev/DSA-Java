class maxSubArray {
    public int maxSubArray(int[] nums) {
        
        int sum = 0; int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i ++){

            sum+=nums[i];

            maxSum = Math.max(sum, maxSum);

            if(sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}


// Interview explanation:

// “In the optimal approach, I use Kadane’s Algorithm. I maintain a sum for the current 
// subarray and a maxSum for the maximum sum found so far. For every element, I add it 
// to sum and update maxSum. If sum becomes negative, I reset it to zero because carrying 
// a negative sum will only decrease the sum of any future subarray. I initialize maxSum
//  with Integer.MIN_VALUE so that the solution also works when all elements are negative.”

// TC & SC
// Time Complexity: O(n) — because we traverse the array only once.
// Space Complexity: O(1) — because we use only a few variables (sum and maxSum) and no extra data structure.












// public This is a different version of the Maximum Subarray Sum problem.

// The important line is:

// “including empty subarray”

// and:

// “The sum of an empty subarray is 0.” {
    
// }
//  in this case maxSum in kadane ==0 while initializing

------------------------------------------------------------------




// Yes. If they ask you to print one maximum-sum subarray, we just add start and end tracking to Kadane's algorithm.

// For your version where empty subarray is allowed:

class kadanes {
    public void maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;

        int start = 0;
        int ansStart = 0;
        int ansEnd = -1;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // Print the maximum subarray
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}