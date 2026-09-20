class Solution {
    public int findMin(int[] nums) {
        int small = nums[0];
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int num = nums[mid];
            if (num < small)
                small = num;
            if (num > nums[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return small;
    }
}
