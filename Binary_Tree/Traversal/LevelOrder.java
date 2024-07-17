package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null){
            return ans;
        }

        que.add(root);
        while(!que.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int level = que.size();
            for(int i=0; i<level; i++){
                if(que.peek().left != null){
                    que.add(que.peek().left);
                }
                if(que.peek().right != null){
                    que.add(que.peek().right);
                }
                row.add(que.poll().val);
            }
            ans.add(row);
        }
        return ans;
    }
}
