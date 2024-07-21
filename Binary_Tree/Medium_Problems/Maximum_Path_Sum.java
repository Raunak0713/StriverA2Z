package Binary_Tree.Medium_Problems;

import Binary_Tree.Traversal.TreeNode;

public class Maximum_Path_Sum {
    int MaxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        Solve(root);
        return MaxSum;
    }

    public int Solve(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = Solve(root.left);
        int rightSum = Solve(root.right);

        int only_one_good = Math.max(leftSum, rightSum) + root.val;

        int only_root_good = root.val;

        int bottom_ans_good = leftSum + rightSum + root.val;

        int first_2_max = Math.max(MaxSum, only_one_good);
        int remaining_2_max = Math.max(only_root_good, bottom_ans_good);

        MaxSum = Math.max(first_2_max, remaining_2_max);

        return Math.max(only_one_good, only_root_good);
    }
}
