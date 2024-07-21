package Binary_Tree.Medium_Problems;

import Binary_Tree.Traversal.TreeNode;

public class Diameter_of_Binary_Tree{
    int MaxLength = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        Height(root);
        return MaxLength;
    }

    public int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        MaxLength = Math.max(MaxLength, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}