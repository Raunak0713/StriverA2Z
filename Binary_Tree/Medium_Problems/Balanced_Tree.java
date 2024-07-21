package Binary_Tree.Medium_Problems;

import Binary_Tree.Traversal.TreeNode;

public class Balanced_Tree {
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
    public int check(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = check(root.left);
        int right = check(root.right);

        if(left == -1 || right == -1){
            return -1;
        }

        if(Math.abs(left-right) > 1){
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
