class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        for (size_t i = 0, k = 1; i < nums.size(); i += 2, k += 2) {
            for (size_t j = i + 2, l = k + 2; j < nums.size(); j += 2, l += 2) {
                if (nums[i] > nums[j]) {
                    swap(nums[i], nums[j]);
                }
                if (nums[k] < nums[l]) {
                    swap(nums[k], nums[l]);
                }
            }
        }
        return nums;
    }
};