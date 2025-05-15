package datastructure.programs;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class RightViewOfBinaryTree {

    public static void printRightView(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightMost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                // Keep updating the rightMost node at this level
                rightMost = curr;

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }

            // Print the last node at the current level
            if (rightMost != null) {
                System.out.print(rightMost.val + " ");
            }
        }
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
                      \
                       7
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);

        System.out.println("Right view of the binary tree:");
        printRightView(root);
    }
}
