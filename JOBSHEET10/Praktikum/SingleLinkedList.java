package JOBSHEET10.Praktikum;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            Node temp = head;
            System.out.print("Isi Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indek salah");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        if(index < 0) {
            System.out.println("Indeks tidak valid");
            return -1;
        }
        Node tmp = head;
        for(int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if(tmp != null) {
            return tmp.data;
        } else {
            System.out.println("Indeks melebihi panjang linked list");
            return -1;
        }
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp != null) {
            return index;
        } else {
            System.out.println("Data tidak ditemukan");
            return -1;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if(!isEmpty()) {
            Node temp = head;
            while(temp != null) {
                if(temp.data == key) {
                    if(temp == head) {
                        removeFirst();
                    } else {
                        Node prev = head;
                        while (prev.next != temp) {
                            prev = prev.next;
                        }
                        prev.next = temp.next;
                        if (temp == tail) {
                            tail = prev;
                        }
                    }
                    break;
                }
                temp = temp.next;
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }

    public void removeAt(int index) {
        if(index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if(index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if(temp == null || temp.next == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            temp.next = temp.next.next;
            if(temp.next == null) {
                tail = temp;
            }
        }   
    }
}