package nawns.interview.linkedlists;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node a           = new Node(1);
        a.next           = new Node(2);
        a.next.next      = new Node(3);
        a.next.next.next = new Node(4);
        System.out.println(a.toString());
        System.out.println(reverseList(a).toString());
    }

    private static Node reverseList(Node head) {
        // a->b->c->null  ->  c->b->a->null
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
