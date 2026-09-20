class Solution {
    public int getSum(int a, int b) {
        int remainder = 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitAtIa = a >> i & 1;
            int bitAtIb = b >> i & 1;

            int currentBit = bitAtIa ^ bitAtIb ^ remainder;
            ans |= (currentBit << i);
            int check = bitAtIa + bitAtIb + remainder;
            if (check > 1)
                remainder = 1;
            else remainder = 0;
        }
        return ans;
    }
}
