package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    List<Integer> ans;
    public List<Integer> inorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        InOrderPrint(root);
        return ans;
    }
    public void InOrderPrint(TreeNode root){
        if(root == null){
            return;
        } 
        InOrderPrint(root.left);
        ans.add(root.val);
        InOrderPrint(root.right);
    }
}
