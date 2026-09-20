class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        for(int i : nums) {
            if(i != val)
            nums[s++] = i;
        }
        return s;
    }
}