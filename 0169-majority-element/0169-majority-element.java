class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n=(0+(nums.length))/2;
        return nums[n];
        
    }
}