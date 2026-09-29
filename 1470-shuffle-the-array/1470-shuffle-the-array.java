class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=nums.length;
        int newarr[]=new int[size];

        int i=0,x=0;
        while((x+n)!=size)
        {
            newarr[i]=nums[x];
            newarr[i+1]=nums[x+n];
            i+=2;
            x++;
            
        }
     return newarr;   
    }
}