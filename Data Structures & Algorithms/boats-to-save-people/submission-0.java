class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int remainder = limit - people[right--];
            if (remainder >= people[left] ) {
                left++;
            }
            ans++;
        }
        return ans;               
    }
}