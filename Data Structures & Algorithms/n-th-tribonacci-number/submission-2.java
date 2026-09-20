class Solution {

    public int tribonacci(int n) {
        return tribonacciCached(new HashMap<>(), n);
    }

    public int tribonacciCached(Map<Integer, Integer> cache, int n) {
        if (cache.containsKey(n))
            return cache.get(n);
        if (n < 1)
            return 0;
        if (n <= 2)
            return 1;
        cache.put(n, tribonacciCached(cache, n - 3) + tribonacciCached(cache, n - 2) + tribonacciCached(cache, n - 1));
        return cache.get(n);
    }
}