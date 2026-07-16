public class assignment{


public static boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){            //Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
                if(nums[i]==nums[j]){
                    return true;                        //  BRUTEFORCE O(n^2)
                }
            }                                  // another optimal solution in hashsets concepts 
            
        }
        return false;
    }    


// Question 2:There is an integer array nums sorted in ascending order (with distinct values).Prior to 
// being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  s
// uch  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-i
// ndexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become 
// [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in 
// nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.Example 1:Input:nums = [4,  5,
//  6, 7, 0, 1, 2], target = 0 Output:   4


    public static int search(int[] nums, int target) {
        int low =0;
        int high =nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
            low++;
            high--;
            }
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low]&& target<nums[mid]){
                    high=mid-1;                                                      
                }else{
                    low=mid+1;
                }
            }
            else{
                 if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;

    }


//Question 4:Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

public static int trappedWater(int height[]){
    int n = height.length;


    int leftmostGreater[]= new int[n];
    leftmostGreater[0]=height[0];
    for(int i=1; i<n; i++){
        leftmostGreater[i]= Math.max(height[i], leftmostGreater[i-1]);
    }

    int rightmostGreater[]= new int[n];
    rightmostGreater[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightmostGreater[i]= Math.max(height[i], rightmostGreater[i+1]);
    }

    int trappedWater=0;
    for(int i=0; i<n; i++){
        int waterLevel=Math.min(rightmostGreater[i],leftmostGreater[i]);

        trappedWater+= waterLevel-height[i];
    }

    return trappedWater;







public static void main(String args[]){
    int nums[] = {1,2,3,4};
    System.out.println(containsDuplicate(nums));
   int nums = [4,5,6,7,0,1,2];
   int target = 0;
   search(nums, target);
}
}