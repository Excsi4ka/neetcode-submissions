class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int start = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            while(set.contains(c)) {
                    set.remove(arr[start++]);
            } 
            set.add(c);
            if(set.size() > ans)
            ans = set.size();

        }
        return ans;
    }
}
