class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first + second);
                    break;
                }
                case "-": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first - second);
                    break;
                }
                case "*": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first * second);
                    break;
                }
                case "/": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first / second);
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(str));
                }
            }
        }
        return stack.pop();
    }
}
