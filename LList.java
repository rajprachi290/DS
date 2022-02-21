public class LList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void del(int k) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == k) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != k) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;

    }

    static void pr() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LList l = new LList();
        l.head = new Node(10);
        Node sec = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(14);
        Node sixth = new Node(15);
        Node seventh = new Node(16);
        l.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        del(11);
        pr();

    }
}
