class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if(j == i) continue;
                sum *= nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}  
