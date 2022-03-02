public class cr {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    static void delnode(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }

    static void pr() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        cr k = new cr();
        k.push(4);
        k.push(5);
        k.push(6);
        k.push(7);
        k.push(8);
        k.push(9);
        pr();
        delnode(5);
        pr();
    }
}
