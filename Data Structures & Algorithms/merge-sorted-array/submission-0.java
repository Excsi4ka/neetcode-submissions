class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int first = m - 1;
        int second = n - 1;
        while (second >= 0) {
            if (first < 0) {
                nums1[index--] = nums2[second--];
                continue;
            }
            if (nums1[first] < nums2[second]) {
                nums1[index--] = nums2[second--];
            } else {
                nums1[index--] = nums1[first--];
            }
        }
    }
}