class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int max = 1, count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] > nums[i - 1]) count++;
            else count = 1;
            max = std::max(max, count);
        }
        return max; 
    }
};