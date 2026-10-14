class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      
      int len=nums.length;
      int[] target = new int[len];
    

      for(int i=0;i<len;i++)
      {
        int ind=index[i];
        for (int j = i; j > ind; j--) {
                target[j] = target[j - 1];
            }

            target[ind] = nums[i];
        }
      

      return target;

    }
}