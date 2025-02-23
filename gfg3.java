
   int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];
        
       
        for (int i = n - 1; i >= 0; i--) {
          
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            
          
            result[i] = st.isEmpty() ? -1 : st.peek();
            
            
            st.push(arr[i]);
        }
        
      
        for (int num : result) {
            list.add(num);
        }
        
        return list;
}
}
