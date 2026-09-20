class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target)
                return mid;
            index = Math.min(start, end);
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}