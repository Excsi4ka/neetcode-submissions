class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        if (strs.length <= 1)
            return s;
        int i = 0;
        for (; i < s.length(); i++) {
            String prefix = s.substring(0, i+1);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix))
                    return s.substring(0, i);
            }
        }
        return s.substring(0, i);  
    }
}