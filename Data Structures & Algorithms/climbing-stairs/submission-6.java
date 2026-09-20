class Solution {

    public int climbStairs(int n) {
        HashMap<Integer, Integer> cache = new HashMap<>(n);
        return climbStairsWithCache(cache, n);
    }

    public int climbStairsWithCache(Map<Integer, Integer> cache, int n) {
        if (cache.containsKey(n))
            return cache.get(n);
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        cache.put(n, climbStairsWithCache(cache, n - 1) + climbStairsWithCache(cache, n - 2));
        return cache.get(n);
    }
}
