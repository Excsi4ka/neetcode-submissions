class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] num, int sI, int eI, int targ) {
        while (sI <= eI) {
            int mid = (eI - sI) / 2 + sI;
            int val = num[mid];
            if (val == targ)
                return mid;
            if (val < targ) 
                sI = mid + 1;
            else 
                eI = mid - 1;
        }
        return -1;
    }
}
