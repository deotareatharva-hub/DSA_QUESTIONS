class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        if(nums.length==0)
        {
            return arr;
        }

        int left=0,right=nums.length-1,mid;
        int ans=-1;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                 ans=mid;
                right=mid-1;

            }
            else if(target>nums[mid])
            {
                left=mid+1;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
        }
        int fo=ans;

          left=0;right=nums.length-1;

        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                 ans=mid;
                left=mid+1;

            }
            else if(target>nums[mid])
            {
                left=mid+1;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
        }
        int so=ans;

         arr[0]=fo;
         arr[1]=so;
        
        return arr;
    }
}