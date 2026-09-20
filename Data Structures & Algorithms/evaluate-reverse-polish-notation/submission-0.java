class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                switch (c) {
                    case "+": {
                        first += second;
                        break;
                    }
                    case "-" : {
                        first -= second;
                        break;
                    }
                    case "*": {
                        first *= second;
                        break;
                    }
                    case "/": {
                        first /= second;
                        break;
                    }
                 }
                 stack.push(first);
                 continue;
            }
            stack.push(Integer.parseInt(c));

        }
        return stack.pop();
    }
}