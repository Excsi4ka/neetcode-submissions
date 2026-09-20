class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length -1, target);
    }

    public int binarySearch(int[] num, int sI, int eI, int targ) {
        int mid = (eI - sI) / 2 + sI;
        int c = num[mid];
        if (num[mid] == targ)
        return mid;
        if(sI == eI) return -1;
        if (targ > c)
        return binarySearch(num, mid + 1, eI, targ);
        else
        return binarySearch(num, sI, mid, targ);
    }
}
