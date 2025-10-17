/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    private static int sum = 0;
    public static void transformTree(Node root) {
        // code here
         sum = 0;
        getSum(root);
        dfs(root);
    }
    
    private static void dfs(Node root) {
        if(root != null) {
            dfs(root.left);
            sum -= root.data;
            root.data = sum;
            dfs(root.right);
        }
    }
    
    private static void getSum(Node root) {
        if(root != null) {
            getSum(root.left);
            sum += root.data;
            getSum(root.right);
        }
    }
}
