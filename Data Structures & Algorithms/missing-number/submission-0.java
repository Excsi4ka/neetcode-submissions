class Solution {
    public int missingNumber(int[] nums) {
        int mask = 0;
        for(int i = 0; i <= nums.length; i++) {
            mask = mask ^ i;
        }
        for (int i : nums) {
            mask = i ^ mask;
        }
        return mask;
    }
}
