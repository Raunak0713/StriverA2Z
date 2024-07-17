package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.List;
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
public class PostOrder {
    List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        PostOrderPrint(root);
        return ans;
    }
    public void PostOrderPrint(TreeNode root){
        if(root == null){
            return;
        }
        PostOrderPrint(root.left);
        PostOrderPrint(root.right);
        ans.add(root.val);
    }
}
