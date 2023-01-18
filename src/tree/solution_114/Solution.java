package tree.solution_114;

import com.sun.source.tree.Tree;

public class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return ;
//        System.out.println(root.val);

        var rightNode = root.right ;
        var leftNode = root.left;

        flatten(root.left);
        flatten(root.right);
        if(root.left != null){
            root.right = root.left;

            var theLastRightNode = root.left;
            while(theLastRightNode.right != null){
                theLastRightNode = theLastRightNode.right;
            }

            theLastRightNode.right = rightNode;
        }
        root.left = null;

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode5;

        treeNode5.right = treeNode6;

        new Solution().flatten(treeNode1);
    }
}
