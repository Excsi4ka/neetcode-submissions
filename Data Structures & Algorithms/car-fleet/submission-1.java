class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i = 0; i < position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a1, a2) -> a1[0] - a2[0]);
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(stack.isEmpty()) {
                stack.push(i);
            } else {
                int index = stack.peek();
                if((double)(target - arr[i][0]) / arr[i][1] > 
                
                (double)(target - arr[index][0]) / arr[index][1]) {
                    stack.push(i);
                }
            }
        }
        return stack.size();
    }
}
