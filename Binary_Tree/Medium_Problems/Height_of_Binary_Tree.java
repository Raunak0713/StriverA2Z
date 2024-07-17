package Binary_Tree.Medium_Problems;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Height_of_Binary_Tree {
    class Solution {
        int tracker = 0;
        
        public int maxDepth(TreeNode root) {
            Max(root, 0);
            return tracker;
        }
        
        public void Max(TreeNode root, int count){
            if(root == null){
                return;
            }
            count++;
            tracker = Math.max(tracker, count);
            Max(root.left, count);
            Max(root.right, count);
        }
    }
}
