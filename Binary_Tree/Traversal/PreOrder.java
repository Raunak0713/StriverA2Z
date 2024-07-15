package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int x){
        x = val;
    }
}

public class PreOrder {
    List<Integer> ans;
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        PreOrderPrint(root);
        return ans;
    }
    public void PreOrderPrint(TreeNode root){
        if(root == null){
            return;
        }
        ans.add(root.val);
        PreOrderPrint(root.left);
        PreOrderPrint(root.right);
    }
}
