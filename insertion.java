public class insertion {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void insert(Node prev, int nd) {
        Node newd = new Node(nd);
        if (prev == null) {
            System.out.println("previous node can't be null");
            return;
        }
        newd.next = prev.next;
        prev.next = newd;
    }

    static void last_insert(int new_data) {
        Node k = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        k.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = k;
        return;

    }

    static void pr() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        insertion j = new insertion();
        j.head = new Node(20);
        Node second = new Node(21);
        Node third = new Node(22);
        Node fourth = new Node(23);
        Node fifth = new Node(24);
        Node sixth = new Node(25);
        Node seventh = new Node(26);
        Node eigth = new Node(27);
        j.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eigth;
        insert(fourth, 90);
        last_insert(78);
        pr();
    }
}
