class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> vals = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        char[] chars = s.toCharArray();
        char prev = chars[chars.length - 1];
        int ans = vals.get(prev);
        for (int i = chars.length - 2; i >= 0; i--) {
            char c = chars[i];
            if (vals.get(c) < vals.get(prev))
                ans -= vals.get(c);
            else
                ans += vals.get(c);
            prev = c;
        }
        return ans;
    }
}