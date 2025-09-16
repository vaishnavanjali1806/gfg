class Solution {
    public int evaluatePostfix(String[] arr) {
       
         Stack<Integer> stack = new Stack<>();

        for (String s : arr) {
            switch (s) {
                case "+":
                    int a1 = stack.pop();
                    int b1 = stack.pop();
                    stack.push(b1 + a1);
                    break;

                case "-":
                    int a2 = stack.pop();
                    int b2 = stack.pop();
                    stack.push(b2 - a2);
                    break;

                case "*":
                    int a3 = stack.pop();
                    int b3 = stack.pop();
                    stack.push(b3 * a3);
                    break;

                case "/":
                    int a4 = stack.pop();
                    int b4 = stack.pop();
                  
                    int div = b4 / a4;
                    if (b4 % a4 != 0 && ((b4 < 0) ^ (a4 < 0))) {
                        div--; 
                    }
                    stack.push(div);
                    break;

                case "^":
                    int a5 = stack.pop();
                    int b5 = stack.pop();
                    stack.push((int) Math.pow(b5, a5));
                    break;

                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] arr1 = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(sol.evaluatePostfix(arr1)); 

        String[] arr2 = {"2", "3", "^", "1", "+"};
        System.out.println(sol.evaluatePostfix(arr2)); 

        String[] arr3 = {"-8", "3", "/"};
        System.out.println(sol.evaluatePostfix(arr3)); 
    }

}
