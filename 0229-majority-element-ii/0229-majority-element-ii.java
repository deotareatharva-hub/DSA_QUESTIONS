class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int i=0,j=0,count=0,n=nums.length,target=n/3;
        List<Integer> list=new ArrayList<>(n);
        boolean boo=false;

        Arrays.sort(nums);
        while(j<n)
        {
            if(nums[i]==nums[j])
            {
                count++;
                j++;
                if(count>target && boo!=true)
                {
                    list.add(nums[i]);
                    boo=true;
                }
            }
            else
            if(nums[i]!=nums[j])
            {
                count=0;
                i=j;
                boo=false;
            }
        }
        return list;
    }
}