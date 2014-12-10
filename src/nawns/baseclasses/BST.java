package nawns.baseclasses;

/**
 * Created by nonis_000 on 11/26/2014.
 */
public class BST {
    public int key;
    public BST left;
    public BST right;

    public BST(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    private static void inOrder(BST bst)  {
        if (bst == null)
            return;
        else {
            inOrder(bst.left);
            System.out.print(bst.key + " ");
            inOrder(bst.right);
        }
    }

    private static void preOrder(BST bst)  {
        if (bst == null)
            return;
        else {
            System.out.print(bst.key + " ");
            preOrder(bst.left);
            preOrder(bst.right);
        }
    }

    private static void postOrder(BST bst)  {
        if (bst == null)
            return;
        else {
            postOrder(bst.left);
            postOrder(bst.right);
            System.out.print(bst.key + " ");
        }
    }

    public void printInOrder() {
        inOrder(this);
        System.out.println("");
    }

    public void printPreOrder() {
        preOrder(this);
        System.out.println("");
    }

    public void printPostOrder() {
        postOrder(this);
        System.out.println("");
    }

    public static BST generateGeneric() {
        BST root                = new BST(20);
        root.left               = new BST(8);
        root.left.left          = new BST(4);
        root.left.right         = new BST(12);
        root.left.right.left    = new BST(10);
        root.left.right.right   = new BST(14);
        root.right              = new BST(22);
        return root;
    }

}
