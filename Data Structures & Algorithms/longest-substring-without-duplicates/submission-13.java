class Solution {
    public int lengthOfLongestSubstring(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();
        int s = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            while (set.contains(c)) {
                set.remove(arr[s++]);
            }  
            set.add(c);
            int len = i - s + 1;
            if (len > ans)
                ans = len;   
        }
        return ans;        
    }
}
