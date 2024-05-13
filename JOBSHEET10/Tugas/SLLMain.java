package JOBSHEET10.Tugas;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList mhs = new SingleLinkedList();

        mhs.print();

        mhs.addFirst(111, "Adrian");
        mhs.print();
        
        mhs.addLast(112, "Prita");
        mhs.print();

        mhs.addFirst(113, "Yusuf");
        mhs.print();
        
        mhs.insertAfter(112, 114, "Doni");
        mhs.print();
        
        mhs.insertAt(3, 115, "Sari");
        mhs.print();
    }
}
