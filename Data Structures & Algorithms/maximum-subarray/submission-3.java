class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int answer = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max + num) {
               max = num;
               if (max > answer)
                   answer = max;
            }
            else {
               max += num;
               if (max > answer)
                  answer = max;
            }
        }
        return answer;
    }
}
