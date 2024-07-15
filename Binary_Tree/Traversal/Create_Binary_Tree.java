package Binary_Tree.Traversal;

import java.util.ArrayList;

class Node{
    int val;
    Node right;
    Node left;

    Node(int x){
        x = val;
    }
}

public class Create_Binary_Tree {
    public static void createTree(Node root0, ArrayList<Integer> v ){
        root0.val = v.get(0);
        
        root0.left = new Node(v.get(1));
        root0.right = new Node(v.get(2));
        
        root0.left.left = new Node(v.get(3));
        root0.left.right = new Node(v.get(4));
        
        root0.right.left = new Node(v.get(5));
        root0.right.right = new Node(v.get(6));
    }
}



                        //     1
                        //    /  \
                        //   2    3
                        //  / \  / \
                        // 4   56   7
                        //    /    / \
                        //   8    9   10