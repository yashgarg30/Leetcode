class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        for (int num : nums1) {
            merged.add(num);
        }
        for (int num : nums2) {
            merged.add(num);
        }
        Collections.sort(merged);
        int size = merged.size();
        if (size % 2 != 0) {
            return merged.get(size / 2);
        } else {
            return (merged.get(size / 2 - 1) + merged.get(size / 2)) / 2.0;
        }
    }
}