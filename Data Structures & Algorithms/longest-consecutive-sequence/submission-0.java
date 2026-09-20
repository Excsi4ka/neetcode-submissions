class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int counter = 0;
        for(int i : set) {
            if(set.contains(i - 1)) continue;
            int tempCounter = 1;
            int num = i + 1;
            while(set.contains(num)) { 
                tempCounter++;
                num += 1;
            }
            if(tempCounter > counter) counter = tempCounter;
        
        }
        return counter;
    }
}
