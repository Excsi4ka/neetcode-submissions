class Solution {

    HashMap<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        if (cache.containsKey(n))
            return cache.get(n);
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        cache.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return cache.get(n);
    }
}
