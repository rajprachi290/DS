public class temp {
    static node head;

    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        temp k = new temp();
        k.head = new node(5);
        node second = new node(6);
        node third = new node(7);
        k.head.next = second;
        second.next = third;
        System.out.println(head.data);
        System.out.println(head.next);
        System.out.println(second.data);
        System.out.println(second.next);
        System.out.println(third.data);
        System.out.println(third.next);
    }
}
