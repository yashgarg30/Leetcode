class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size();
        int m=nums2.size();
        vector<int> merged;
        for (int i = 0; i < n; i++) {
            merged.push_back(nums1[i]);
        }
        for (int i = 0; i < m; i++) {
            merged.push_back(nums2[i]);
        }
        sort(merged.begin(), merged.end());
        int s=merged.size();
        if (s % 2 != 0)
            return merged[s / 2];
        else
            return (merged[s / 2 - 1] + merged[s / 2]) / 2.0;
    }
};