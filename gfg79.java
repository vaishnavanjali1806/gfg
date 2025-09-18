class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
         int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> stack = new Stack<>();

        // Traverse twice for circular array
        for (int i = 0; i < 2 * n; i++) {
            int num = arr[i % n];
            
            while (!stack.isEmpty() && arr[stack.peek()] < num) {
                res.set(stack.pop(), num);
            }

            if (i < n) {
                stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5, 7, 1, 2, 6, 0};
        System.out.println(sol.nextGreater(arr));
    }
}
