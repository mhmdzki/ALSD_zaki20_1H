package JOBSHEET13;

public class DoubleLinkedList {
    Node20 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(int item, int jarak) {
        if(isEmpty()) {
            head = new Node20(null, item, jarak, null);
        } else {
            Node20 newNode = new Node20(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Index melebihi batas");
        }

        Node20 temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.jarak;
    }

    public int get(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Index melebihi batas");
        }

        Node20 temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    // void remove(int index) throws Exception {
    //     Node20 current = head;

    //     while (current != null) {
    //         if(current.data == index) {
    //             if(current.prev != null) {
    //                 current.prev.next = current.next;
    //             } else {
    //                 head = current.next;
    //             }

    //             if(current.next != null) {
    //                 current.next.prev = current.prev;
    //             }

    //             break;
    //         }      
            
    //         current = current.next;
    //     }
    // }

    void removeLast() throws Exception {
        if(isEmpty()) { 
            throw new Exception("List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            head = null;
            size--;
            return;
        }

        Node20 current = head;
        
        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        Node20 current = head;
        
        while (current != null) {
            if(current.data == index) {
                if(current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if(current.next != null) {
                    current.next.prev = current.prev;
                }

                break;
            }
            current = current.next;
        }
        size--;
    }
}
