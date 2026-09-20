class MinStack {

    ArrayDeque<Integer> mainStack = new ArrayDeque();

    ArrayDeque<Integer> extraStack = new ArrayDeque();

    public MinStack() {
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(extraStack.isEmpty()) 
            extraStack.push(val);
        else if (extraStack.peek() >= val)
            extraStack.push(val);
    }
    
    public void pop() {
        int val = mainStack.pop();
        if(val == extraStack.peek())
            extraStack.pop();

    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return extraStack.peek();
    }
}
