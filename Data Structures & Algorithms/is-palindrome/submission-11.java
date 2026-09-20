class Solution {
    public boolean isPalindrome(String st) {
        char[] arr = st.toLowerCase().toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char s = arr[start++];
            while (!isValid(s) && start < arr.length)
            s = arr[start++];
            char e = arr[end--];
            while(!isValid(e) && end > 0)
            e = arr[end--];
            if(!isValid(s) || !isValid(e))
            return true;
            if(s != e)
            return false;

        }
        return true;
        
    }

    public boolean isValid(char c) {
        return Character.isLetterOrDigit(c);
    }
}
