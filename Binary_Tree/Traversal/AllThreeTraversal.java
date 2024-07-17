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

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x){
        data = x;
    }
}

public class AllThreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<ArrayList<Integer>> ans = ThreeTraversal(root);
        System.out.print("Pre Order Traversal : ");
        PrintList(ans.get(0));
        System.out.print("In Order Traversal : ");
        PrintList(ans.get(1));
        System.out.print("Post Order Traversal : ");
        PrintList(ans.get(2));
        
    }

    public static void PrintList(ArrayList<Integer> res){
        for(int a : res){
            System.out.print(a + " ");
        }
    }

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
                PreOrder.add(result.root.data);
                result.num++;
                stack.push(result);
                if(result.root.left != null){
                    stack.push(new Pair(result.root.left, 1));
                }
            }
            else if(result.num == 2){
                InOrder.add(result.root.data);
                result.num = 3;
                stack.push(result);
                if(result.root.right != null){
                    stack.push(new Pair(result.root.right, 1));
                }
            }else if(result.num == 3){
                PostOrder.add(result.root.data);
            }
        }

        list.add(PreOrder);
        list.add(InOrder);
        list.add(PostOrder);
        return list;
    }
}
