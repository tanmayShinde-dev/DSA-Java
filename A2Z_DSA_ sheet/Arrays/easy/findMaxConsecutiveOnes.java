class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int maxStreak=0;

        for(int i=0; i<nums.length; i++){

            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }

            maxStreak = Math.max(maxStreak, count);

            count=0;
        }

        return maxStreak;
        
    }
}