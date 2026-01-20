class Solution {
    
    StringBuilder sb = new StringBuilder("");
    Stack<Character> stack = new Stack<>();
    
    public void append(char x) {
        // append x into document
        sb.append(x);
        stack.clear();
    }

    public void undo() {
        // undo last change
        if(sb.length() > 0){
            char deletedChar = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            stack.push(deletedChar);
        }
    }

    public void redo() {
        // redo changes
        if(!stack.isEmpty()){
            sb.append(stack.pop());
        }
    }

    public String read() {
        // read the document
        return sb.toString();
    }
}
