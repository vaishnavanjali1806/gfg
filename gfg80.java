class Solution {
    public int minParentheses(String s) {
        // code here
           int len=s.length();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        return st.isEmpty()? count:count+st.size();
    }
}
