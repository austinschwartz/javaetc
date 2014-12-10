package nawns.interview.trees;

import nawns.baseclasses.BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by nonis_000 on 11/26/2014.
 */
public class SerializeTree {

    public static String serialize(BST bst) {
        if (bst == null)
            return "#";
        else {
            return bst.key + " " + serialize(bst.left) + " " + serialize(bst.right);
        }
    }


    public static BST deserialize(String str) {
        String[] arr = str.trim().split(" ");
        return deserialize(arr);
    }

    static int index = 0;

    private static BST deserialize(String[] stringArray) {
        if (index >= stringArray.length)
            return null;
        if (stringArray[index].equals("#")) {
            index++;
            return null;
        }

        int value = Integer.parseInt(stringArray[index]);
        BST tree = new BST(value);
        index++;
        tree.left = deserialize(stringArray);
        tree.right = deserialize(stringArray);
        return tree;
    }

    public static void main(String[] args) {
        BST bst = BST.generateGeneric();
        System.out.println(serialize(bst));
        System.out.println(serialize(deserialize(serialize(bst))));
    }

}
