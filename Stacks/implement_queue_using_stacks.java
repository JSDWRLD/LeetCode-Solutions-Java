import java.util.Stack;

class MyQueue {
    private Stack<Integer> mainStack;
    private Stack<Integer> tempStack;

    public MyQueue() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }
    
    // Time O(1)
    public void push(int x) {
        // Push the new element onto the main stack, only add to temp
        // once we finish popping from temp
        mainStack.push(x);
    }
    
    // Time O(n)
    public int pop() {
        // Move elements to temp stack if temp is empty
        if (tempStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                tempStack.push(mainStack.pop());
            }
        }
        return tempStack.pop();
    }
    
    // Time O(n)
    public int peek() {
        // Move elements to temp stack if temp is empty
        if (tempStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                tempStack.push(mainStack.pop());
            }
        }
        return tempStack.peek();
    }
    
    // Time O(1)
    public boolean empty() {
        return mainStack.isEmpty() && tempStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
