class Solution {
    public int[] runningSum(int[] nums) {

        int sum=nums[0];
        int n=nums.length;
        int newarr[]=new int[n];
        newarr[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            sum+=nums[i];
            newarr[i]=sum;

        }
        return newarr;
    }
}