class Solution {
    public boolean isHappy(int n) {
        String num = Integer.toString(n);
        HashSet<Integer> seen = new HashSet<>();
        while (true) {
            char[] arr = num.toCharArray();
            int sum = 0;
            for (int c : arr) {
                sum += Math.pow((c - '0'), 2);
            }
            if (sum == 1)
                return true;
            System.out.println(sum);
            if (seen.contains(sum))
                return false;
            seen.add(sum);
            num = Integer.toString(sum);
        }
    }
}
