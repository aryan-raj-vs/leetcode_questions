class Solution {
    public int longestSubarray(int[] nums) {
        int count = 2;
        int maxcount = 2;
        int a = 0;
        int b = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i-1] + nums[i-2] == nums[i]) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else if(nums[i-1]+nums[i-2]!=nums[i]) {
                count = 2;
            }
        }
        return maxcount;
    }
}