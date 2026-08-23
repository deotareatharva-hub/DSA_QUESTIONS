class Solution {
    public int maxProfit(int[] nums) {

        int min=nums[0],maxpro=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            else if((nums[i]-min)>maxpro)
            {
                        maxpro=(nums[i]-min);
            }
        }
        return maxpro;        
    }
}