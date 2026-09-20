class Solution {
    public void reverseString(char[] st) {
        int s = 0;
        int e = st.length - 1;
        while (s <= e) {
            char temp = st[e];
            st[e--] = st[s++];
            st[s - 1] = temp; 
        }
    }
}