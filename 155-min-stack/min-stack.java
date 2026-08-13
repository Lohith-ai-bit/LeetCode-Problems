class MinStack {
    Stack<Integer> s1;
    Stack<Integer> minstack;

    public MinStack() {
        s1 = new Stack<>();
        minstack=new Stack<>();
        
    }
    
    public void push(int value) {
        if(minstack.isEmpty()){
            s1.push(value);
            minstack.push(value);
        }
        else if(!minstack.isEmpty() && minstack.peek() >=value){
            s1.push(value);
            minstack.push(value);
        }
        else{
            s1.push(value);
        }
    }
    
    public void pop() {
        if(!minstack.isEmpty() && s1.peek().equals(minstack.peek())){
            s1.pop();
            minstack.pop();
        }
        else{
            s1.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */