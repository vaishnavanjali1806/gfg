class Solution {
    static int maxLength(String s) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                ans = Math.max(ans,i-st.peek());
            }
        }
        return ans;
    }
}
