package nawns.interview.trees;

import nawns.baseclasses.BST;
/**
 * Created by nonis_000 on 11/26/2014.
 */
public class BSTTraversals {

    public static void main(String[] args) {
        BST bst = BST.generateGeneric();

        bst.printPreOrder();
        bst.printInOrder();
        bst.printPostOrder();


    }

}
