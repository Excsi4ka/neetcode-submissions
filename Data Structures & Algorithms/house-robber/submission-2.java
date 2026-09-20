class Solution {

    public int rob(int[] nums) {
        return robDynamic(nums, new HashMap<>(), 0);
    }


    public int robDynamic(int[] nums, Map<Integer, Integer> cache, int index) {
        if (cache.containsKey(index))
            return cache.get(index);
        if (index >= nums.length)
            return 0; 
        int first = nums[index];
        int second = index + 1 >= nums.length ? 0 : nums[index + 1];
        cache.put(index, Math.max(first + robDynamic(nums, cache, index + 2), second + robDynamic(nums, cache, index + 3)));
        return cache.get(index);
    }
    
}
