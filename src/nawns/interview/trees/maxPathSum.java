package nawns.interview.trees;

import nawns.baseclasses.BST;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class maxPathSum {

    public static int max;


    public static int maxPathSum(BST root) {
        if (root == null)
            max = 0;
        else
            max = root.key;
        findMax(root);
        return max;
    }

    private static int findMax(BST node) {
        if (node == null)
            return 0;

        int left = findMax(node.left);
        int right = findMax(node.right);

        max = Math.max(node.key + left + right, max);

        return node.key + Math.max(left, right);
    }

    public static void main(String[] args) {
        BST tree = BST.generateGeneric();
        tree.printInOrder();
        System.out.println(maxPathSum(tree));
    }
}
