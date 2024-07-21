package Binary_Tree.Medium_Problems;

import Binary_Tree.Traversal.TreeNode;

public class Height_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
