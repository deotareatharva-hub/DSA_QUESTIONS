class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int newarr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            int num=nums[i];
            for(int j=0;j<n;j++)
            {
                if(num!=nums[j] && nums[j]<num &&j!=i)
                {
                    count++;
                }

            }
            newarr[i]=count;
        }
        return newarr;
    }
}