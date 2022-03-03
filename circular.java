public class circular {
    static class Node {
        int data;
        Node next;
    }

    static Node cir(Node head) {
        Node start = head;
        while (head.next != null)
            head = head.next;
        head.next = start;
        return start;
    }

    static Node push(Node head, int new_data) {
        Node newd = new Node();
        newd.data = new_data;
        newd.next = (head);
        head = newd;
        return head;
    }

    static void pr(Node node) {
        Node start = node;
        while (node.next != start) {
            System.out.print(node.data + "");
            node = node.next;
        }
        System.out.println("" + node.data);
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 4);
        head = push(head, 5);
        head = push(head, 6);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 9);

        cir(head);
        pr(head);
    }

}
