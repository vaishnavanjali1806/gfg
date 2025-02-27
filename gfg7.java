  class Solution {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public Solution() {}

    // Add an element to the top of Stack
    public void push(int x) {
        st.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
         if (!st.isEmpty()) {
            int removed = st.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
          if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
