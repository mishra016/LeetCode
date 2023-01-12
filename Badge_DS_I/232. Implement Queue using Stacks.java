class MyQueue {

    ArrayList<Integer> arr = new ArrayList<>();

    public MyQueue() {
        arr = new ArrayList<>();
    }
    
    public void push(int x) {
        arr.add(x);
        
    }
    
    public int pop() {
        int var = arr.get(0);
        arr.remove(0);
        return var;
    }
    
    public int peek() {
        return arr.get(0);
    }
    
    public boolean empty() {
        return arr.isEmpty();
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