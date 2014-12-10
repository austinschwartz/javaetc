package nawns.interview.linkedlists;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node head = this;
        while (head != null) {
            if (head.next == null)
                sb.append(head.value);
            else
                sb.append(head.value + " ");
            head = head.next;
        }
        return sb.toString();
    }
}
