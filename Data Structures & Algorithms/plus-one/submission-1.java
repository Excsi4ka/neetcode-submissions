class Solution {
    public int[] plusOne(int[] digits) {
        int toAdd = 1;
        for(int i = digits.length -1; i >= 0; i--) {
            if(toAdd == 0) return digits;

            if(digits[i] + toAdd > 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                toAdd = 0;
            }

            if(i == 0 && toAdd == 1) {
                int[] ans = new int[digits.length + 1];
                ans[0] = 1;
                // for(int j = 0; j < digits.length; j++)
                //     ans[j+1] = digits[j];
                return ans;
            }

        }
        return digits;
    }
}
