class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if(stack.isEmpty()) {
                ans[i] = 0;
                stack.push(i);
                continue;
            } else {
                int temp = temperatures[i];
                while(!stack.isEmpty()) {
                    int prevTemp = temperatures[stack.peek()];
                    if(prevTemp <= temp)
                        stack.pop();
                    else
                        break;    
                }
                int diff = 0;
                if(!stack.isEmpty())
                    diff = stack.peek() - i;
                ans[i] = diff;
                stack.push(i);
            }
            
            }
            return ans;
        }

    
}
