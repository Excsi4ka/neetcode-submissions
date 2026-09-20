class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        int len = char2.length;
        int i;
        for (i = 0; i < char1.length; i++) {
            b.append(char1[i]);
            if(i < len)
            b.append(char2[i]);
        }
        for (int j = i; j < len; j++)
        b.append(char2[j]);
    
        return b.toString();
        
    }
}