//L232
class MyQueue{
    //fields
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    //constructor
    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    //offer method
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }
    
    private void helper(){
        if (stackOut.isEmpty()){
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
    
    //poll method
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        helper();
        return stackOut.pop();
        // if (stackOut.isEmpty()){
        //     return null;
        // }else{
        //     return stackOut.pop();
        // }
    }
    
    /** Get the front element. */
    public int peek() {
        helper();
        return stackOut.peek();
        // if (stackOut.isEmpty()){
        //     return null;
        // }else{
        //     return stackOut.peek();
        // }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stackIn.isEmpty() && stackOut.isEmpty()){
            return true;
        }else{
            return false;
        }
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



