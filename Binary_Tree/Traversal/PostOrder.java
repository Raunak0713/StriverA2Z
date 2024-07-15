package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.List;

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
