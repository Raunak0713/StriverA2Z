// File: Binary_Tree/Traversal/TreeNode.java
package Binary_Tree.Traversal;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    // Default constructor
    public TreeNode() {}

    // Constructor with value
    public TreeNode(int val) { this.val = val; }

    // Constructor with value, left and right children
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
