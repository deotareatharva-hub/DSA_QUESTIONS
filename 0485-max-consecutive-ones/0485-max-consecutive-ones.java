class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int i,count=0,high=0;

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                if(count>high)
                {
                high=count;
                }
            }
            else
            if(nums[i]!=1 && i!=nums.length-1)
            {
                
                count=0;
            }
        }
        return high;
    }
}