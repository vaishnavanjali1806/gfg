class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
       
        int n = arr.length;

        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Stack to store indices
        Deque<Integer> stack = new ArrayDeque<>();

        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));

        // Step 3: Traverse array
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   freq.get(arr[stack.peek()]) < freq.get(arr[i])) {
                res.set(stack.pop(), arr[i]);
            }
            stack.push(i);
        }

        return res;
    }
}
   
