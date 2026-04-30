class MinStack {
    Stack<Long> stack;
    long min;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
        }else{
            stack.push(val - min);
            if(val < min){
                min = val;
            }
        }
    }
    
    public void pop() {        
        long top = stack.pop();
        if(top < 0){
            min = min - top;
        }

    }
    
    public int top() {
        if(stack.peek() <= 0) return (int) min;
        
        return (int) (min + stack.peek());
        
    }
    
    public int getMin() {
        return (int) min;
    }
}
