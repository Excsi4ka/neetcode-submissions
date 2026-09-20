class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l*2];
        for (int i = 0; i < l; i++) {
            int num = nums[i];
            ans[i] = num;
            ans[i + l] = num;

        }
        return ans;
    }
}