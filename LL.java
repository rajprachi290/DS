public class LL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int newdata) {
        Node k = new Node(newdata);
        k.next = head;
        head = k;
    }

    static void pr() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.head = new Node(6);
        Node sec = new Node(7);
        Node third = new Node(8);
        Node fourth = new Node(9);
        list.head.next = sec;
        sec.next = third;
        third.next = fourth;
        list.insert(8);
        list.insert(10);
        pr();
    }
}
