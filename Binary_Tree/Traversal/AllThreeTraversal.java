package Binary_Tree.Traversal;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
    int num;
    TreeNode root;
    Pair(TreeNode root, int x){
        this.root = root;
        this.num = x;
    }
}


public class AllThreeTraversal {
    public static ArrayList<ArrayList<Integer>> ThreeTraversal(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();

        ArrayList<Integer> PreOrder = new ArrayList<>();
        ArrayList<Integer> InOrder = new ArrayList<>();
        ArrayList<Integer> PostOrder = new ArrayList<>();

        stack.push(new Pair(root, 1));

        while(!stack.isEmpty()){
            Pair result = stack.pop();
            if(result.num == 1){
                PreOrder.add(result.root.val);
                result.num++;
                stack.push(result);
                if(result.root.left != null){
                    stack.push(new Pair(result.root.left, 1));
                }
            }
            else if(result.num == 2){
                InOrder.add(result.root.val);
                result.num = 3;
                stack.push(result);
                if(result.root.right != null){
                    stack.push(new Pair(result.root.right, 1));
                }
            }else if(result.num == 3){
                PostOrder.add(result.root.val);
            }
        }

        list.add(PreOrder);
        list.add(InOrder);
        list.add(PostOrder);
        return list;
    }
}
