package Binary_Tree.Medium_Problems;

public class Identical_Trees {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;  // Both trees are empty
        }
        if (p == null || q == null) {
            return false;  // One tree is empty and the other is not
        }
        if (p.val != q.val) {
            return false;  // Values of the current nodes do not match
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
