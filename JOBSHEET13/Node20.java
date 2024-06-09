package JOBSHEET13;

public class Node20 {
    int data, jarak;
    Node20 prev, next;

    public Node20(Node20 prev, int data, int jarak, Node20 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
