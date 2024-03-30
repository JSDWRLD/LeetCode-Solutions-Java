class MinStack {
    private Stack<Integer> min;
    private Stack<Integer> stack;

    // we create two stacks one to keep track of minimum and one
    // for actual values
    public MinStack() {
        min = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        // compare to see if we need to update the minimum
        if(min.isEmpty() || val <= min.peek()) min.push(val);
        
    }
    
    public void pop() {
        int num = stack.pop();
        if(num == min.peek()) min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return min.peek();
    }

    // Time Complexity: O(1)
    // Space Complexity: O(n)
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
