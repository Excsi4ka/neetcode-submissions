class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] ans = new int[k];
        List<Integer>[] lists = new ArrayList[nums.length + 1];
                for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }
        map.forEach((key,val) -> {
            lists[val].add(key);
        });
        int index = 0;
        for(int i = lists.length - 1; i >= 0; i--) {
            if(lists[i].isEmpty()) continue;
            for(int num : lists[i]) {
                if(index == ans.length) return ans;
                ans[index++] = num;
            }
        }
        return ans;
    }
}
